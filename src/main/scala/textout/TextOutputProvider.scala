package com.selfdualbrain.continuum.textout

trait TextOutputProvider {
  def append(string: String)
  def newLine()
}
