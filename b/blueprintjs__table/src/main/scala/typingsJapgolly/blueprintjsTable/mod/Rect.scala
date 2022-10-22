package typingsJapgolly.blueprintjsTable.mod

import typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.AnyRect
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/table", "Rect")
@js.native
open class Rect protected ()
  extends typingsJapgolly.blueprintjsTable.libEsmCommonMod.Rect {
  def this(left: Double, top: Double, width: Double, height: Double) = this()
}
/* static members */
object Rect {
  
  @JSImport("@blueprintjs/table", "Rect")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table", "Rect.ORIGIN")
  @js.native
  def ORIGIN: typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = js.native
  inline def ORIGIN_=(x: typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ORIGIN")(x.asInstanceOf[js.Any])
  
  /**
    * Returns the CSS properties representing the absolute positioning of
    * this Rect.
    */
  inline def style(rect: AnyRect): CSSProperties = ^.asInstanceOf[js.Dynamic].applyDynamic("style")(rect.asInstanceOf[js.Any]).asInstanceOf[CSSProperties]
  
  /**
    * Returns a new Rect that subtracts the origin of the second argument
    * from the first.
    */
  inline def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("subtractOrigin")(anyRect0.asInstanceOf[js.Any], anyRect1.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect]
  
  /**
    * Returns the smallest Rect that entirely contains the supplied rects
    */
  inline def union(anyRect0: AnyRect, anyRect1: AnyRect): typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(anyRect0.asInstanceOf[js.Any], anyRect1.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect]
  
  /**
    * Given a ClientRect or Rect object, returns a Rect object.
    */
  inline def wrap(rect: AnyRect): typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(rect.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.blueprintjsTable.libEsmCommonRectMod.Rect]
}
