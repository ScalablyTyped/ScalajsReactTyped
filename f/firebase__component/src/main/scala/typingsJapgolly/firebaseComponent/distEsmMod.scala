package typingsJapgolly.firebaseComponent

import typingsJapgolly.firebaseComponent.distEsmSrcTypesMod.ComponentType
import typingsJapgolly.firebaseComponent.distEsmSrcTypesMod.InstanceFactory
import typingsJapgolly.firebaseComponent.distEsmSrcTypesMod.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmMod {
  
  @JSImport("@firebase/component/dist/esm", "Component")
  @js.native
  open class Component[T /* <: Name */] protected ()
    extends typingsJapgolly.firebaseComponent.distEsmSrcComponentMod.Component[T] {
    /**
      *
      * @param name The public service name, e.g. app, auth, firestore, database
      * @param instanceFactory Service factory responsible for creating the public interface
      * @param type whether the service provided by the component is public or private
      */
    def this(name: T, instanceFactory: InstanceFactory[T], `type`: ComponentType) = this()
  }
  
  @JSImport("@firebase/component/dist/esm", "ComponentContainer")
  @js.native
  open class ComponentContainer protected ()
    extends typingsJapgolly.firebaseComponent.distEsmSrcComponentContainerMod.ComponentContainer {
    def this(name: String) = this()
  }
  
  @JSImport("@firebase/component/dist/esm", "Provider")
  @js.native
  open class Provider[T /* <: Name */] protected ()
    extends typingsJapgolly.firebaseComponent.distEsmSrcProviderMod.Provider[T] {
    def this(
      name: T,
      container: typingsJapgolly.firebaseComponent.distEsmSrcComponentContainerMod.ComponentContainer
    ) = this()
  }
}
