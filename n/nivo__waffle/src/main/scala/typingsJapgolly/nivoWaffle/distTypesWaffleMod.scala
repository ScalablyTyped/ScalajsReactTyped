package typingsJapgolly.nivoWaffle

import typingsJapgolly.nivoWaffle.distTypesTypesMod.Datum
import typingsJapgolly.nivoWaffle.distTypesTypesMod.SvgProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesWaffleMod {
  
  @JSImport("@nivo/waffle/dist/types/Waffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[RawDatum /* <: Datum */](props: SvgProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
