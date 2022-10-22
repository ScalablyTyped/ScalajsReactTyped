package typingsJapgolly.restartHooks

import typingsJapgolly.restartHooks.anon.FnCall
import typingsJapgolly.restartHooks.anon.PartialRecordDefaultBreak
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsUseBreakpointMod {
  
  @JSImport("@restart/hooks/cjs/useBreakpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(breakpointMap: PartialRecordDefaultBreak): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpointMap.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(breakpointMap: PartialRecordDefaultBreak, window: Window): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpointMap.asInstanceOf[js.Any], window.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(breakpoint: DefaultBreakpoints): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(breakpoint: DefaultBreakpoints, direction: Unit, window: Window): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], window.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(breakpoint: DefaultBreakpoints, direction: BreakpointDirection): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def default(breakpoint: DefaultBreakpoints, direction: BreakpointDirection, window: Window): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoint.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], window.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createBreakpointHook[TKey /* <: String */](breakpointValues: Record[TKey, String | Double]): FnCall[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBreakpointHook")(breakpointValues.asInstanceOf[js.Any]).asInstanceOf[FnCall[TKey]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.restartHooks.restartHooksBooleans.`true`
    - typingsJapgolly.restartHooks.restartHooksStrings.up
    - typingsJapgolly.restartHooks.restartHooksStrings.down
  */
  trait BreakpointDirection extends StObject
  object BreakpointDirection {
    
    inline def down: typingsJapgolly.restartHooks.restartHooksStrings.down = "down".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.down]
    
    inline def `true`: typingsJapgolly.restartHooks.restartHooksBooleans.`true` = true.asInstanceOf[typingsJapgolly.restartHooks.restartHooksBooleans.`true`]
    
    inline def up: typingsJapgolly.restartHooks.restartHooksStrings.up = "up".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.up]
  }
  
  type BreakpointMap[TKey /* <: String */] = Partial[Record[TKey, BreakpointDirection]]
  
  /* Inlined @restart/hooks.@restart/hooks/cjs/useBreakpoint.BreakpointMap<@restart/hooks.@restart/hooks/cjs/useBreakpoint.DefaultBreakpoints> */
  trait DefaultBreakpointMap extends StObject {
    
    var lg: js.UndefOr[BreakpointDirection] = js.undefined
    
    var md: js.UndefOr[BreakpointDirection] = js.undefined
    
    var sm: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xl: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xs: js.UndefOr[BreakpointDirection] = js.undefined
    
    var xxl: js.UndefOr[BreakpointDirection] = js.undefined
  }
  object DefaultBreakpointMap {
    
    inline def apply(): DefaultBreakpointMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DefaultBreakpointMap]
    }
    
    extension [Self <: DefaultBreakpointMap](x: Self) {
      
      inline def setLg(value: BreakpointDirection): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
      
      inline def setLgUndefined: Self = StObject.set(x, "lg", js.undefined)
      
      inline def setMd(value: BreakpointDirection): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
      
      inline def setMdUndefined: Self = StObject.set(x, "md", js.undefined)
      
      inline def setSm(value: BreakpointDirection): Self = StObject.set(x, "sm", value.asInstanceOf[js.Any])
      
      inline def setSmUndefined: Self = StObject.set(x, "sm", js.undefined)
      
      inline def setXl(value: BreakpointDirection): Self = StObject.set(x, "xl", value.asInstanceOf[js.Any])
      
      inline def setXlUndefined: Self = StObject.set(x, "xl", js.undefined)
      
      inline def setXs(value: BreakpointDirection): Self = StObject.set(x, "xs", value.asInstanceOf[js.Any])
      
      inline def setXsUndefined: Self = StObject.set(x, "xs", js.undefined)
      
      inline def setXxl(value: BreakpointDirection): Self = StObject.set(x, "xxl", value.asInstanceOf[js.Any])
      
      inline def setXxlUndefined: Self = StObject.set(x, "xxl", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.restartHooks.restartHooksStrings.xs
    - typingsJapgolly.restartHooks.restartHooksStrings.sm
    - typingsJapgolly.restartHooks.restartHooksStrings.md
    - typingsJapgolly.restartHooks.restartHooksStrings.lg
    - typingsJapgolly.restartHooks.restartHooksStrings.xl
    - typingsJapgolly.restartHooks.restartHooksStrings.xxl
  */
  trait DefaultBreakpoints extends StObject
  object DefaultBreakpoints {
    
    inline def lg: typingsJapgolly.restartHooks.restartHooksStrings.lg = "lg".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.lg]
    
    inline def md: typingsJapgolly.restartHooks.restartHooksStrings.md = "md".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.md]
    
    inline def sm: typingsJapgolly.restartHooks.restartHooksStrings.sm = "sm".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.sm]
    
    inline def xl: typingsJapgolly.restartHooks.restartHooksStrings.xl = "xl".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.xl]
    
    inline def xs: typingsJapgolly.restartHooks.restartHooksStrings.xs = "xs".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.xs]
    
    inline def xxl: typingsJapgolly.restartHooks.restartHooksStrings.xxl = "xxl".asInstanceOf[typingsJapgolly.restartHooks.restartHooksStrings.xxl]
  }
}
