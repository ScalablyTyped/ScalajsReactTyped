package typingsJapgolly.victoryCreateContainer

import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esMod {
  
  @JSImport("victory-create-container/es", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def combineContainerMixins(mixins: Any, Container: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("combineContainerMixins")(mixins.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def createContainer[V, W](c1: ContainerType, c2: ContainerType): ComponentType[V & W] = (^.asInstanceOf[js.Dynamic].applyDynamic("createContainer")(c1.asInstanceOf[js.Any], c2.asInstanceOf[js.Any])).asInstanceOf[ComponentType[V & W]]
  
  inline def makeCreateContainerFunction(mixinMap: Any, Container: Any): js.Function2[/* behaviorA */ Any, /* behaviorB */ Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeCreateContainerFunction")(mixinMap.asInstanceOf[js.Any], Container.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* behaviorA */ Any, /* behaviorB */ Any, Any]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.brush
    - typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.cursor
    - typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.selection
    - typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.voronoi
    - typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.zoom
  */
  trait ContainerType extends StObject
  object ContainerType {
    
    inline def brush: typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.brush = "brush".asInstanceOf[typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.brush]
    
    inline def cursor: typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.cursor = "cursor".asInstanceOf[typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.cursor]
    
    inline def selection: typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.selection = "selection".asInstanceOf[typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.selection]
    
    inline def voronoi: typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.voronoi = "voronoi".asInstanceOf[typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.voronoi]
    
    inline def zoom: typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.zoom = "zoom".asInstanceOf[typingsJapgolly.victoryCreateContainer.victoryCreateContainerStrings.zoom]
  }
}
