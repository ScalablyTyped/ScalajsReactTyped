package typingsJapgolly.nivoBar

import typingsJapgolly.nivoBar.distTypesTypesMod.BarAnnotationsProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBarAnnotationsMod {
  
  @JSImport("@nivo/bar/dist/types/BarAnnotations", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def BarAnnotations[RawDatum](hasBarsAnnotations: BarAnnotationsProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BarAnnotations")(hasBarsAnnotations.asInstanceOf[js.Any]).asInstanceOf[Element]
}
