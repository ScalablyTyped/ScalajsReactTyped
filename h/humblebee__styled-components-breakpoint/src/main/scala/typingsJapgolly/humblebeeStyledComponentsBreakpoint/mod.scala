package typingsJapgolly.humblebeeStyledComponentsBreakpoint

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.humblebeeStyledComponentsBreakpoint.anon.Down
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@humblebee/styled-components-breakpoint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(breakpoints: Breakpoints): Down = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Down]
  
  inline def getMedia(breakpoints: Breakpoints): Down = ^.asInstanceOf[js.Dynamic].applyDynamic("getMedia")(breakpoints.asInstanceOf[js.Any]).asInstanceOf[Down]
  
  type Breakpoints = StringDictionary[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.up
    - typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.down
    - typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.only
  */
  trait Rule extends StObject
  object Rule {
    
    inline def down: typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.down = "down".asInstanceOf[typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.down]
    
    inline def only: typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.only = "only".asInstanceOf[typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.only]
    
    inline def up: typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.up = "up".asInstanceOf[typingsJapgolly.humblebeeStyledComponentsBreakpoint.humblebeeStyledComponentsBreakpointStrings.up]
  }
}
