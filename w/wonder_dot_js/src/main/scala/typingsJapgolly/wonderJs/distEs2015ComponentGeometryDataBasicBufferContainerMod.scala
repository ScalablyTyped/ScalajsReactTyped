package typingsJapgolly.wonderJs

import typingsJapgolly.wonderJs.distEs2015ComponentGeometryDataCommonBufferContainerMod.CommonBufferContainer
import typingsJapgolly.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentGeometryDataBasicBufferContainerMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/data/BasicBufferContainer", "BasicBufferContainer")
  @js.native
  open class BasicBufferContainer protected () extends CommonBufferContainer {
    def this(entityObject: GameObject) = this()
  }
  /* static members */
  object BasicBufferContainer {
    
    @JSImport("wonder.js/dist/es2015/component/geometry/data/BasicBufferContainer", "BasicBufferContainer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(entityObject: GameObject): BasicBufferContainer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(entityObject.asInstanceOf[js.Any]).asInstanceOf[BasicBufferContainer]
  }
}
