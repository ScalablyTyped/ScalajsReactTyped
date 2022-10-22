package typingsJapgolly.nivoStream

import typingsJapgolly.nivoStream.distTypesTypesMod.StreamDatum
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamSvgProps
import typingsJapgolly.nivoStream.nivoStreamStrings.height
import typingsJapgolly.nivoStream.nivoStreamStrings.width
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveStreamMod {
  
  @JSImport("@nivo/stream/dist/types/ResponsiveStream", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ResponsiveStream[RawDatum /* <: StreamDatum */](props: Omit[StreamSvgProps[RawDatum], height | width]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ResponsiveStream")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
