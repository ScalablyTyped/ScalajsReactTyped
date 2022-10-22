package typingsJapgolly.stormReactDiagrams

import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseEntity
import typingsJapgolly.stormReactDiagrams.distSrcBaseEntityMod.BaseListener
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModel
import typingsJapgolly.stormReactDiagrams.distSrcModelsBaseModelMod.BaseModelListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFactoriesAbstractFactoryMod {
  
  /* note: abstract class */ @JSImport("storm-react-diagrams/dist/src/factories/AbstractFactory", "AbstractFactory")
  @js.native
  open class AbstractFactory[T /* <: BaseModel[BaseEntity[BaseListener[Any]], BaseModelListener] */] protected () extends StObject {
    def this(name: String) = this()
    
    def getNewInstance(): T = js.native
    def getNewInstance(initialConfig: Any): T = js.native
    
    def getType(): String = js.native
    
    var `type`: String = js.native
  }
}
