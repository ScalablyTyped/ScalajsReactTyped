package typingsJapgolly.sane

import typingsJapgolly.sane.mod.AllEventType
import typingsJapgolly.sane.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saneStrings {
  
  @js.native
  sealed trait add
    extends StObject
       with AllEventType
       with EventType
  inline def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait all
    extends StObject
       with EventType
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait change
    extends StObject
       with AllEventType
       with EventType
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait delete
    extends StObject
       with AllEventType
       with EventType
  inline def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait error
    extends StObject
       with EventType
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait ready
    extends StObject
       with EventType
  inline def ready: ready = "ready".asInstanceOf[ready]
}
