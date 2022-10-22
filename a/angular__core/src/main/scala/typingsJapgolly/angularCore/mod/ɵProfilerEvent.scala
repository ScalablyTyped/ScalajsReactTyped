package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreInts.`0`
import typingsJapgolly.angularCore.angularCoreInts.`1`
import typingsJapgolly.angularCore.angularCoreInts.`2`
import typingsJapgolly.angularCore.angularCoreInts.`3`
import typingsJapgolly.angularCore.angularCoreInts.`4`
import typingsJapgolly.angularCore.angularCoreInts.`5`
import typingsJapgolly.angularCore.angularCoreInts.`6`
import typingsJapgolly.angularCore.angularCoreInts.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreInts.`0`
  - typingsJapgolly.angularCore.angularCoreInts.`1`
  - typingsJapgolly.angularCore.angularCoreInts.`2`
  - typingsJapgolly.angularCore.angularCoreInts.`3`
  - typingsJapgolly.angularCore.angularCoreInts.`4`
  - typingsJapgolly.angularCore.angularCoreInts.`5`
  - typingsJapgolly.angularCore.angularCoreInts.`6`
  - typingsJapgolly.angularCore.angularCoreInts.`7`
*/
trait ɵProfilerEvent extends StObject
object ɵProfilerEvent {
  
  /**
    * Corresponds to the point in time after the runtime has called a lifecycle hook of a component
    * or directive.
    */
  inline def LifecycleHookEnd: `5` = 5.asInstanceOf[`5`]
  
  /**
    * Corresponds to the point in time before the runtime has called a lifecycle hook of a component
    * or directive.
    */
  inline def LifecycleHookStart: `4` = 4.asInstanceOf[`4`]
  
  /**
    * Corresponds to the point in time after the runtime has evaluated an expression associated with
    * an event or an output.
    */
  inline def OutputEnd: `7` = 7.asInstanceOf[`7`]
  
  /**
    * Corresponds to the point in time before the runtime has evaluated an expression associated with
    * an event or an output.
    */
  inline def OutputStart: `6` = 6.asInstanceOf[`6`]
  
  /**
    * Corresponds to the point in time after the runtime has called the template function of a
    * component with `RenderFlags.Create`.
    */
  inline def TemplateCreateEnd: `1` = 1.asInstanceOf[`1`]
  
  /**
    * Corresponds to the point in time before the runtime has called the template function of a
    * component with `RenderFlags.Create`.
    */
  inline def TemplateCreateStart: `0` = 0.asInstanceOf[`0`]
  
  /**
    * Corresponds to the point in time after the runtime has called the template function of a
    * component with `RenderFlags.Update`.
    */
  inline def TemplateUpdateEnd: `3` = 3.asInstanceOf[`3`]
  
  /**
    * Corresponds to the point in time before the runtime has called the template function of a
    * component with `RenderFlags.Update`.
    */
  inline def TemplateUpdateStart: `2` = 2.asInstanceOf[`2`]
}
