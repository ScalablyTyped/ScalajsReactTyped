package typingsJapgolly.nivoArcs

import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelComponent
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesArcLabelsPropsMod {
  
  trait ArcLabelsProps[Datum /* <: DatumWithArcAndColor */] extends StObject {
    
    var arcLabel: PropertyAccessor[Datum, String]
    
    var arcLabelsComponent: ArcLabelComponent[Datum]
    
    var arcLabelsRadiusOffset: Double
    
    var arcLabelsSkipAngle: Double
    
    var arcLabelsTextColor: InheritedColorConfig[Datum]
  }
  object ArcLabelsProps {
    
    inline def apply[Datum /* <: DatumWithArcAndColor */](
      arcLabel: PropertyAccessor[Datum, String],
      arcLabelsComponent: /* props */ ArcLabelProps[Datum] => Element,
      arcLabelsRadiusOffset: Double,
      arcLabelsSkipAngle: Double,
      arcLabelsTextColor: InheritedColorConfig[Datum]
    ): ArcLabelsProps[Datum] = {
      val __obj = js.Dynamic.literal(arcLabel = arcLabel.asInstanceOf[js.Any], arcLabelsComponent = js.Any.fromFunction1(arcLabelsComponent), arcLabelsRadiusOffset = arcLabelsRadiusOffset.asInstanceOf[js.Any], arcLabelsSkipAngle = arcLabelsSkipAngle.asInstanceOf[js.Any], arcLabelsTextColor = arcLabelsTextColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArcLabelsProps[Datum]]
    }
    
    extension [Self <: ArcLabelsProps[?], Datum /* <: DatumWithArcAndColor */](x: Self & ArcLabelsProps[Datum]) {
      
      inline def setArcLabel(value: PropertyAccessor[Datum, String]): Self = StObject.set(x, "arcLabel", value.asInstanceOf[js.Any])
      
      inline def setArcLabelFunction1(value: Datum => String): Self = StObject.set(x, "arcLabel", js.Any.fromFunction1(value))
      
      inline def setArcLabelsComponent(value: /* props */ ArcLabelProps[Datum] => Element): Self = StObject.set(x, "arcLabelsComponent", js.Any.fromFunction1(value))
      
      inline def setArcLabelsRadiusOffset(value: Double): Self = StObject.set(x, "arcLabelsRadiusOffset", value.asInstanceOf[js.Any])
      
      inline def setArcLabelsSkipAngle(value: Double): Self = StObject.set(x, "arcLabelsSkipAngle", value.asInstanceOf[js.Any])
      
      inline def setArcLabelsTextColor(value: InheritedColorConfig[Datum]): Self = StObject.set(x, "arcLabelsTextColor", value.asInstanceOf[js.Any])
    }
  }
}
