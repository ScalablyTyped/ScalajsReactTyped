package typingsJapgolly.reactBulmaComponents

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.reactBulmaComponents.anon.Column
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`0`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`2`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`3`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`4`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`5`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`6`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`7`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`8`
import typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.div
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.Breakpoint
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typingsJapgolly.reactBulmaComponents.srcComponentsMod.ResponsiveModifiers
import typingsJapgolly.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsColumnsMod extends Shortcut {
  
  @JSImport("react-bulma-components/src/components/columns", JSImport.Default)
  @js.native
  val default: (BulmaComponent[ColumnGroupProps, div]) & Column = js.native
  
  trait ColumnBreakpointConfiguration extends StObject {
    
    var narrow: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[ColumnSize] = js.undefined
    
    var size: js.UndefOr[ColumnSize] = js.undefined
  }
  object ColumnBreakpointConfiguration {
    
    inline def apply(): ColumnBreakpointConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnBreakpointConfiguration]
    }
    
    extension [Self <: ColumnBreakpointConfiguration](x: Self) {
      
      inline def setNarrow(value: Boolean): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      inline def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
      
      inline def setOffset(value: ColumnSize): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSize(value: ColumnSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait ColumnGroupProps extends StObject {
    
    var breakpoint: js.UndefOr[Breakpoint] = js.undefined
    
    var centered: js.UndefOr[Boolean] = js.undefined
    
    var desktop: js.UndefOr[GapProps & ResponsiveModifiers] = js.undefined
    
    var gap: js.UndefOr[GapProps] = js.undefined
    
    var mobile: js.UndefOr[GapProps & ResponsiveModifiers] = js.undefined
    
    var multiline: js.UndefOr[Boolean] = js.undefined
    
    var tablet: js.UndefOr[GapProps & ResponsiveModifiers] = js.undefined
    
    var touch: js.UndefOr[GapProps & ResponsiveModifiers] = js.undefined
    
    var vCentered: js.UndefOr[Boolean] = js.undefined
    
    var widescreen: js.UndefOr[GapProps & ResponsiveModifiers] = js.undefined
  }
  object ColumnGroupProps {
    
    inline def apply(): ColumnGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnGroupProps]
    }
    
    extension [Self <: ColumnGroupProps](x: Self) {
      
      inline def setBreakpoint(value: Breakpoint): Self = StObject.set(x, "breakpoint", value.asInstanceOf[js.Any])
      
      inline def setBreakpointUndefined: Self = StObject.set(x, "breakpoint", js.undefined)
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setCenteredUndefined: Self = StObject.set(x, "centered", js.undefined)
      
      inline def setDesktop(value: GapProps & ResponsiveModifiers): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setGap(value: GapProps): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setMobile(value: GapProps & ResponsiveModifiers): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setMultiline(value: Boolean): Self = StObject.set(x, "multiline", value.asInstanceOf[js.Any])
      
      inline def setMultilineUndefined: Self = StObject.set(x, "multiline", js.undefined)
      
      inline def setTablet(value: GapProps & ResponsiveModifiers): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      inline def setTouch(value: GapProps & ResponsiveModifiers): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setVCentered(value: Boolean): Self = StObject.set(x, "vCentered", value.asInstanceOf[js.Any])
      
      inline def setVCenteredUndefined: Self = StObject.set(x, "vCentered", js.undefined)
      
      inline def setWidescreen(value: GapProps & ResponsiveModifiers): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      inline def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
    }
  }
  
  trait ColumnProps extends StObject {
    
    var desktop: js.UndefOr[ColumnBreakpointConfiguration & ResponsiveModifiers] = js.undefined
    
    var fullhd: js.UndefOr[ColumnBreakpointConfiguration & ResponsiveModifiers] = js.undefined
    
    var mobile: js.UndefOr[ColumnBreakpointConfiguration & ResponsiveModifiers] = js.undefined
    
    var narrow: js.UndefOr[Boolean] = js.undefined
    
    var offset: js.UndefOr[ColumnSize] = js.undefined
    
    var size: js.UndefOr[ColumnSize] = js.undefined
    
    var tablet: js.UndefOr[ColumnBreakpointConfiguration & ResponsiveModifiers] = js.undefined
    
    var touch: js.UndefOr[ColumnBreakpointConfiguration & ResponsiveModifiers] = js.undefined
    
    var widescreen: js.UndefOr[ColumnBreakpointConfiguration & ResponsiveModifiers] = js.undefined
  }
  object ColumnProps {
    
    inline def apply(): ColumnProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnProps]
    }
    
    extension [Self <: ColumnProps](x: Self) {
      
      inline def setDesktop(value: ColumnBreakpointConfiguration & ResponsiveModifiers): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
      
      inline def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
      
      inline def setFullhd(value: ColumnBreakpointConfiguration & ResponsiveModifiers): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
      
      inline def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
      
      inline def setMobile(value: ColumnBreakpointConfiguration & ResponsiveModifiers): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
      
      inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
      
      inline def setNarrow(value: Boolean): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
      
      inline def setNarrowUndefined: Self = StObject.set(x, "narrow", js.undefined)
      
      inline def setOffset(value: ColumnSize): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setSize(value: ColumnSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTablet(value: ColumnBreakpointConfiguration & ResponsiveModifiers): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
      
      inline def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
      
      inline def setTouch(value: ColumnBreakpointConfiguration & ResponsiveModifiers): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
      
      inline def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
      
      inline def setWidescreen(value: ColumnBreakpointConfiguration & ResponsiveModifiers): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
      
      inline def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`0`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`2`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`3`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`4`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`5`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`6`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`7`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`8`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`9`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`10`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`11`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`12`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`three-quarters`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`two-thirds`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.half
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-third`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-quarter`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-fifth`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`two-fifths`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`three-fifths`
    - typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`four-fifths`
  */
  trait ColumnSize extends StObject
  object ColumnSize {
    
    inline def `0`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`0` = 0.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`0`]
    
    inline def `1`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1` = 1.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`1`]
    
    inline def `10`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`10` = 10.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`10`]
    
    inline def `11`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`11` = 11.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`11`]
    
    inline def `12`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`12` = 12.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`12`]
    
    inline def `2`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`2` = 2.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`2`]
    
    inline def `3`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`3` = 3.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`3`]
    
    inline def `4`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`4` = 4.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`4`]
    
    inline def `5`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`5` = 5.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`5`]
    
    inline def `6`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`6` = 6.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`6`]
    
    inline def `7`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`7` = 7.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`7`]
    
    inline def `8`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`8` = 8.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`8`]
    
    inline def `9`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`9` = 9.asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsInts.`9`]
    
    inline def `four-fifths`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`four-fifths` = "four-fifths".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`four-fifths`]
    
    inline def half: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.half = "half".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.half]
    
    inline def `one-fifth`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-fifth` = "one-fifth".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-fifth`]
    
    inline def `one-quarter`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-quarter` = "one-quarter".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-quarter`]
    
    inline def `one-third`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-third` = "one-third".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`one-third`]
    
    inline def `three-fifths`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`three-fifths` = "three-fifths".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`three-fifths`]
    
    inline def `three-quarters`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`three-quarters` = "three-quarters".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`three-quarters`]
    
    inline def `two-fifths`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`two-fifths` = "two-fifths".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`two-fifths`]
    
    inline def `two-thirds`: typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`two-thirds` = "two-thirds".asInstanceOf[typingsJapgolly.reactBulmaComponents.reactBulmaComponentsStrings.`two-thirds`]
  }
  
  trait GapProps extends StObject {
    
    var gap: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | String | Number] = js.undefined
  }
  object GapProps {
    
    inline def apply(): GapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GapProps]
    }
    
    extension [Self <: GapProps](x: Self) {
      
      inline def setGap(value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | String | Number): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    }
  }
  
  type _To = (BulmaComponent[ColumnGroupProps, div]) & Column
  
  /* This means you don't have to write `default`, but can instead just say `srcComponentsColumnsMod.foo` */
  override def _to: (BulmaComponent[ColumnGroupProps, div]) & Column = default
}
