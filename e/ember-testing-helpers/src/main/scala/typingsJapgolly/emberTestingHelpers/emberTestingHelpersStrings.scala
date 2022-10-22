package typingsJapgolly.emberTestingHelpers

import typingsJapgolly.emberTestingHelpers.mod.KeyEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emberTestingHelpersStrings {
  
  @js.native
  sealed trait keydown
    extends StObject
       with KeyEventType
  inline def keydown: keydown = "keydown".asInstanceOf[keydown]
  
  @js.native
  sealed trait keypress
    extends StObject
       with KeyEventType
  inline def keypress: keypress = "keypress".asInstanceOf[keypress]
  
  @js.native
  sealed trait keyup
    extends StObject
       with KeyEventType
  inline def keyup: keyup = "keyup".asInstanceOf[keyup]
}
