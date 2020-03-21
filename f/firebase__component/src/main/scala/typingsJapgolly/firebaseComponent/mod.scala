package typingsJapgolly.firebaseComponent

import typingsJapgolly.firebaseComponent.typesMod.ComponentType
import typingsJapgolly.firebaseComponent.typesMod.InstanceFactory
import typingsJapgolly.firebaseComponent.typesMod.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/component", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Component[T /* <: Name */] protected ()
    extends typingsJapgolly.firebaseComponent.componentMod.Component[T] {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whether the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
  }
  
  @js.native
  class ComponentContainer protected ()
    extends typingsJapgolly.firebaseComponent.componentContainerMod.ComponentContainer {
    def this(name: String) = this()
  }
  
  @js.native
  class Provider[T /* <: Name */] protected ()
    extends typingsJapgolly.firebaseComponent.providerMod.Provider[T] {
    def this(name: T, container: typingsJapgolly.firebaseComponent.componentContainerMod.ComponentContainer) = this()
  }
  
}

