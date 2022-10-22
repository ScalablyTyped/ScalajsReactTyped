package typingsJapgolly.grommet

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.FillType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.grommetStrings.`bottom-left`
import typingsJapgolly.grommet.grommetStrings.`bottom-right`
import typingsJapgolly.grommet.grommetStrings.`top-left`
import typingsJapgolly.grommet.grommetStrings.`top-right`
import typingsJapgolly.grommet.grommetStrings.bottom
import typingsJapgolly.grommet.grommetStrings.center
import typingsJapgolly.grommet.grommetStrings.first
import typingsJapgolly.grommet.grommetStrings.last
import typingsJapgolly.grommet.grommetStrings.left
import typingsJapgolly.grommet.grommetStrings.right
import typingsJapgolly.grommet.grommetStrings.top
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsStackMod {
  
  @JSImport("grommet/es6/components/Stack", "Stack")
  @js.native
  val Stack: FC[StackExtendedProps] = js.native
  
  trait StackExtendedProps
    extends StObject
       with StackProps
       with ClassAttributes[HTMLDivElement]
       with HTMLAttributes[HTMLDivElement]
  object StackExtendedProps {
    
    inline def apply(): StackExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackExtendedProps]
    }
  }
  
  trait StackProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var anchor: js.UndefOr[
        center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
      ] = js.undefined
    
    var fill: js.UndefOr[FillType] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var guidingChild: js.UndefOr[Double | first | last] = js.undefined
    
    var interactiveChild: js.UndefOr[Double | first | last] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
  }
  object StackProps {
    
    inline def apply(): StackProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StackProps]
    }
    
    extension [Self <: StackProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAnchor(
        value: center | left | right | top | bottom | `top-left` | `bottom-left` | `top-right` | `bottom-right`
      ): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setFill(value: FillType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setGuidingChild(value: Double | first | last): Self = StObject.set(x, "guidingChild", value.asInstanceOf[js.Any])
      
      inline def setGuidingChildUndefined: Self = StObject.set(x, "guidingChild", js.undefined)
      
      inline def setInteractiveChild(value: Double | first | last): Self = StObject.set(x, "interactiveChild", value.asInstanceOf[js.Any])
      
      inline def setInteractiveChildUndefined: Self = StObject.set(x, "interactiveChild", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    }
  }
  
  type divProps = DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]
}
