package typingsJapgolly.nginstackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libClassdefFieldEventMod {
  
  inline def apply(args: Any*): Unit = ^.asInstanceOf[js.Dynamic].apply(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  
  @JSImport("@nginstack/engine/lib/classdef/FieldEvent", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with FieldEvent {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    var field: typingsJapgolly.nginstackEngine.libClassdefFieldMod.^ = js.native
  }
  @JSImport("@nginstack/engine/lib/classdef/FieldEvent", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait FieldEvent extends StObject {
    
    var field: typingsJapgolly.nginstackEngine.libClassdefFieldMod.^
  }
  object FieldEvent {
    
    inline def apply(field: typingsJapgolly.nginstackEngine.libClassdefFieldMod.^): FieldEvent = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldEvent]
    }
    
    extension [Self <: FieldEvent](x: Self) {
      
      inline def setField(value: typingsJapgolly.nginstackEngine.libClassdefFieldMod.^): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    }
  }
}
