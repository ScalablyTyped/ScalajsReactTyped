package typingsJapgolly.trimblemapsTrimblemapsJs.mod

import typingsJapgolly.trimblemapsTrimblemapsJs.anon.MaxWidth
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.imperial
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.metric
import typingsJapgolly.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.nautical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@trimblemaps/trimblemaps-js", "ScaleControl")
@js.native
open class ScaleControl () extends Control {
  def this(options: MaxWidth) = this()
  
  @JSName("getDefaultPosition")
  def getDefaultPosition_MScaleControl(): String = js.native
  
  def setUnit(unit: imperial | metric | nautical): Unit = js.native
}
