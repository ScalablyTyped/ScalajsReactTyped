package typingsJapgolly.baidumapWebSdk.global.BMap

import typingsJapgolly.baidumapWebSdk.anon.Points
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BMap.Convertor")
@js.native
open class Convertor ()
  extends StObject
     with typingsJapgolly.baidumapWebSdk.BMap.Convertor {
  
  /* CompleteClass */
  override def translate(
    points: js.Array[typingsJapgolly.baidumapWebSdk.BMap.Point],
    from: Double,
    to: Double,
    callback: js.Function1[/* result */ Points, Unit]
  ): Unit = js.native
}
