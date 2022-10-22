package typingsJapgolly.devtoolsDetect

import typingsJapgolly.devtoolsDetect.mod.Orientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devtoolsDetectStrings {
  
  @js.native
  sealed trait devtoolschange extends StObject
  inline def devtoolschange: devtoolschange = "devtoolschange".asInstanceOf[devtoolschange]
  
  @js.native
  sealed trait horizontal
    extends StObject
       with Orientation
  inline def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait vertical
    extends StObject
       with Orientation
  inline def vertical: vertical = "vertical".asInstanceOf[vertical]
}
