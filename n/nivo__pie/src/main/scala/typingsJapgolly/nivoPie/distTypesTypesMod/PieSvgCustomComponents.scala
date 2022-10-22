package typingsJapgolly.nivoPie.distTypesTypesMod

import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PieSvgCustomComponents[RawDatum] extends StObject {
  
  var arcLinkLabelComponent: js.UndefOr[ArcLinkLabelComponent[ComputedDatum[RawDatum]]] = js.undefined
}
object PieSvgCustomComponents {
  
  inline def apply[RawDatum](): PieSvgCustomComponents[RawDatum] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PieSvgCustomComponents[RawDatum]]
  }
  
  extension [Self <: PieSvgCustomComponents[?], RawDatum](x: Self & PieSvgCustomComponents[RawDatum]) {
    
    inline def setArcLinkLabelComponent(value: /* props */ ArcLinkLabelProps[ComputedDatum[RawDatum]] => Element): Self = StObject.set(x, "arcLinkLabelComponent", js.Any.fromFunction1(value))
    
    inline def setArcLinkLabelComponentUndefined: Self = StObject.set(x, "arcLinkLabelComponent", js.undefined)
  }
}
