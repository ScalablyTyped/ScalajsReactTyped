package typingsJapgolly.firebaseComponent

import typingsJapgolly.firebaseComponent.distSrcComponentContainerMod.ComponentContainer
import typingsJapgolly.firebaseComponent.distSrcTypesMod.ComponentType
import typingsJapgolly.firebaseComponent.distSrcTypesMod.Dictionary
import typingsJapgolly.firebaseComponent.distSrcTypesMod.InstanceFactory
import typingsJapgolly.firebaseComponent.distSrcTypesMod.InstanceFactoryOptions
import typingsJapgolly.firebaseComponent.distSrcTypesMod.InstantiationMode
import typingsJapgolly.firebaseComponent.distSrcTypesMod.Name
import typingsJapgolly.firebaseComponent.distSrcTypesMod.onInstanceCreatedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcComponentMod {
  
  @JSImport("@firebase/component/dist/src/component", "Component")
  @js.native
  open class Component[T /* <: Name */] protected () extends StObject {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whether the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
    
    def instanceFactory(container: ComponentContainer, options: InstanceFactoryOptions): /* import warning: importer.ImportType#apply Failed type conversion: @firebase/component.@firebase/component/dist/src/types.NameServiceMapping[T] */ js.Any = js.native
    
    var instantiationMode: InstantiationMode = js.native
    
    var multipleInstances: Boolean = js.native
    
    val name: T = js.native
    
    var onInstanceCreated: onInstanceCreatedCallback[T] | Null = js.native
    
    /**
      * Properties to be added to the service namespace
      */
    var serviceProps: Dictionary = js.native
    
    def setInstanceCreatedCallback(callback: onInstanceCreatedCallback[T]): this.type = js.native
    
    def setInstantiationMode(mode: InstantiationMode): this.type = js.native
    
    def setMultipleInstances(multipleInstances: Boolean): this.type = js.native
    
    def setServiceProps(props: Dictionary): this.type = js.native
    
    val `type`: ComponentType = js.native
  }
}
