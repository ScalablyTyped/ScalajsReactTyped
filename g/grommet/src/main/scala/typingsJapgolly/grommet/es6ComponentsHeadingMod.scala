package typingsJapgolly.grommet

import org.scalajs.dom.HTMLHeadingElement
import typingsJapgolly.grommet.es6UtilsMod.A11yTitleType
import typingsJapgolly.grommet.es6UtilsMod.AlignSelfType
import typingsJapgolly.grommet.es6UtilsMod.ColorType
import typingsJapgolly.grommet.es6UtilsMod.GridAreaType
import typingsJapgolly.grommet.es6UtilsMod.MarginType
import typingsJapgolly.grommet.es6UtilsMod.Omit
import typingsJapgolly.grommet.es6UtilsMod.PolymorphicType
import typingsJapgolly.grommet.es6UtilsMod.TextAlignType
import typingsJapgolly.grommet.grommetStrings.`1`
import typingsJapgolly.grommet.grommetStrings.`2`
import typingsJapgolly.grommet.grommetStrings.`3`
import typingsJapgolly.grommet.grommetStrings.`4`
import typingsJapgolly.grommet.grommetStrings.`5`
import typingsJapgolly.grommet.grommetStrings.`6`
import typingsJapgolly.grommet.grommetStrings.`break-word`
import typingsJapgolly.grommet.grommetStrings.anywhere
import typingsJapgolly.grommet.grommetStrings.bold
import typingsJapgolly.grommet.grommetStrings.bolder
import typingsJapgolly.grommet.grommetStrings.color
import typingsJapgolly.grommet.grommetStrings.large
import typingsJapgolly.grommet.grommetStrings.lighter
import typingsJapgolly.grommet.grommetStrings.medium
import typingsJapgolly.grommet.grommetStrings.normal
import typingsJapgolly.grommet.grommetStrings.small
import typingsJapgolly.grommet.grommetStrings.xlarge
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsHeadingMod {
  
  @JSImport("grommet/es6/components/Heading", "Heading")
  @js.native
  val Heading: FC[HeadingExtendedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped grommet.grommet/es6/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/es6/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/es6/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/es6/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/es6/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> | grommet.grommet/es6/utils.Omit<react.react.DetailedHTMLProps<react.react.HTMLAttributes<std.HTMLHeadingElement>, std.HTMLHeadingElement>, 'color'> */ trait HeadingExtendedProps
    extends StObject
       with HeadingProps
  object HeadingExtendedProps {
    
    inline def apply(): HeadingExtendedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingExtendedProps]
    }
  }
  
  trait HeadingProps extends StObject {
    
    var a11yTitle: js.UndefOr[A11yTitleType] = js.undefined
    
    var alignSelf: js.UndefOr[AlignSelfType] = js.undefined
    
    var as: js.UndefOr[PolymorphicType] = js.undefined
    
    var color: js.UndefOr[ColorType] = js.undefined
    
    var fill: js.UndefOr[Boolean] = js.undefined
    
    var gridArea: js.UndefOr[GridAreaType] = js.undefined
    
    var level: js.UndefOr[
        `1` | `2` | `3` | `4` | `5` | `6` | typingsJapgolly.grommet.grommetInts.`1` | typingsJapgolly.grommet.grommetInts.`2` | typingsJapgolly.grommet.grommetInts.`3` | typingsJapgolly.grommet.grommetInts.`4` | typingsJapgolly.grommet.grommetInts.`5` | typingsJapgolly.grommet.grommetInts.`6`
      ] = js.undefined
    
    var margin: js.UndefOr[MarginType] = js.undefined
    
    var overflowWrap: js.UndefOr[normal | `break-word` | anywhere | String] = js.undefined
    
    var responsive: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large | xlarge | String] = js.undefined
    
    var textAlign: js.UndefOr[TextAlignType] = js.undefined
    
    var truncate: js.UndefOr[Boolean] = js.undefined
    
    var weight: js.UndefOr[normal | bold | lighter | bolder | Double | String] = js.undefined
  }
  object HeadingProps {
    
    inline def apply(): HeadingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeadingProps]
    }
    
    extension [Self <: HeadingProps](x: Self) {
      
      inline def setA11yTitle(value: A11yTitleType): Self = StObject.set(x, "a11yTitle", value.asInstanceOf[js.Any])
      
      inline def setA11yTitleUndefined: Self = StObject.set(x, "a11yTitle", js.undefined)
      
      inline def setAlignSelf(value: AlignSelfType): Self = StObject.set(x, "alignSelf", value.asInstanceOf[js.Any])
      
      inline def setAlignSelfUndefined: Self = StObject.set(x, "alignSelf", js.undefined)
      
      inline def setAs(value: PolymorphicType): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setGridArea(value: GridAreaType): Self = StObject.set(x, "gridArea", value.asInstanceOf[js.Any])
      
      inline def setGridAreaUndefined: Self = StObject.set(x, "gridArea", js.undefined)
      
      inline def setLevel(
        value: `1` | `2` | `3` | `4` | `5` | `6` | typingsJapgolly.grommet.grommetInts.`1` | typingsJapgolly.grommet.grommetInts.`2` | typingsJapgolly.grommet.grommetInts.`3` | typingsJapgolly.grommet.grommetInts.`4` | typingsJapgolly.grommet.grommetInts.`5` | typingsJapgolly.grommet.grommetInts.`6`
      ): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setOverflowWrap(value: normal | `break-word` | anywhere | String): Self = StObject.set(x, "overflowWrap", value.asInstanceOf[js.Any])
      
      inline def setOverflowWrapUndefined: Self = StObject.set(x, "overflowWrap", js.undefined)
      
      inline def setResponsive(value: Boolean): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      inline def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      inline def setSize(value: small | medium | large | xlarge | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextAlign(value: TextAlignType): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTruncate(value: Boolean): Self = StObject.set(x, "truncate", value.asInstanceOf[js.Any])
      
      inline def setTruncateUndefined: Self = StObject.set(x, "truncate", js.undefined)
      
      inline def setWeight(value: normal | bold | lighter | bolder | Double | String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
    }
  }
  
  type hProps = Omit[DetailedHTMLProps[HTMLAttributes[HTMLHeadingElement], HTMLHeadingElement], color]
}
