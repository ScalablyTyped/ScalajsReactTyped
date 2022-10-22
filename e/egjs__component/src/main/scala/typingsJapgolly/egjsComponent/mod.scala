package typingsJapgolly.egjsComponent

import typingsJapgolly.egjsComponent.declarationTypesMod.ComponentEventConstructor
import typingsJapgolly.egjsComponent.declarationTypesMod.DefaultProps
import typingsJapgolly.egjsComponent.declarationTypesMod.EventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@egjs/component", JSImport.Default)
  @js.native
  open class default[T /* <: EventMap */] ()
    extends typingsJapgolly.egjsComponent.declarationComponentMod.default[T]
  object default {
    
    @JSImport("@egjs/component", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@egjs/component", "default.VERSION")
    @js.native
    def VERSION: String = js.native
    inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@egjs/component", "ComponentEvent")
  @js.native
  val ComponentEvent: ComponentEventConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@egjs/component", "ComponentEvent")
  @js.native
  open class ComponentEventCls[TYPE /* <: String */, THIS] protected ()
    extends StObject
       with DefaultProps[TYPE, THIS] {
    def this(eventType: TYPE) = this()
    
    /* CompleteClass */
    var currentTarget: THIS = js.native
    
    /* CompleteClass */
    var eventType: TYPE = js.native
    
    /* CompleteClass */
    override def isCanceled(): Boolean = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
}
