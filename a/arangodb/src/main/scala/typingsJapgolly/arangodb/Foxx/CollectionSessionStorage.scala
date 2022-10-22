package typingsJapgolly.arangodb.Foxx

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionSessionStorage
  extends StObject
     with SessionStorage {
  
  def clear(session: Session): Boolean
  
  @JSName("new")
  def new_MCollectionSessionStorage(): Session
  
  def prune(): js.Array[String]
  
  def save(session: Session): Session
}
object CollectionSessionStorage {
  
  inline def apply(
    clear: Session => Boolean,
    forClient: Session => String | Null,
    fromClient: String => Session | Null,
    `new`: CallbackTo[Session],
    prune: CallbackTo[js.Array[String]],
    save: Session => Session
  ): CollectionSessionStorage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), forClient = js.Any.fromFunction1(forClient), fromClient = js.Any.fromFunction1(fromClient), prune = prune.toJsFn, save = js.Any.fromFunction1(save))
    __obj.updateDynamic("new")(`new`.toJsFn)
    __obj.asInstanceOf[CollectionSessionStorage]
  }
  
  extension [Self <: CollectionSessionStorage](x: Self) {
    
    inline def setClear(value: Session => Boolean): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
    
    inline def setNew(value: CallbackTo[Session]): Self = StObject.set(x, "new", value.toJsFn)
    
    inline def setPrune(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "prune", value.toJsFn)
    
    inline def setSave(value: Session => Session): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
  }
}
