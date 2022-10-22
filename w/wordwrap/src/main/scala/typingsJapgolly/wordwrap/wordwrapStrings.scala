package typingsJapgolly.wordwrap

import typingsJapgolly.wordwrap.mod.Mode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wordwrapStrings {
  
  @js.native
  sealed trait hard
    extends StObject
       with Mode
  inline def hard: hard = "hard".asInstanceOf[hard]
  
  @js.native
  sealed trait soft
    extends StObject
       with Mode
  inline def soft: soft = "soft".asInstanceOf[soft]
}
