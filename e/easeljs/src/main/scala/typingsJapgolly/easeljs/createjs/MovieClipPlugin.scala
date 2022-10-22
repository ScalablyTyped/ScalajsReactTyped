package typingsJapgolly.easeljs.createjs

import typingsJapgolly.tweenjs.createjs.Tween
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MovieClipPlugin extends StObject {
  
  // methods
  def tween(
    tween: Tween,
    prop: String,
    value: String,
    startValues: js.Array[Any],
    endValues: js.Array[Any],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
  def tween(
    tween: Tween,
    prop: String,
    value: Boolean,
    startValues: js.Array[Any],
    endValues: js.Array[Any],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
  def tween(
    tween: Tween,
    prop: String,
    value: Double,
    startValues: js.Array[Any],
    endValues: js.Array[Any],
    ratio: Double,
    wait: js.Object,
    end: js.Object
  ): Unit = js.native
}
