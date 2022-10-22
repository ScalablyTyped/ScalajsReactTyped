package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.webpack.anon.Read
import typingsJapgolly.webpack.anon.Write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DependenciesBlock extends StObject {
  
  /**
  	 * Adds a DependencyBlock to DependencyBlock relationship.
  	 * This is used for when a Module has a AsyncDependencyBlock tie (for code-splitting)
  	 */
  def addBlock(block: AsyncDependenciesBlock): Unit
  
  def addDependency(dependency: Dependency): Unit
  
  var blocks: js.Array[AsyncDependenciesBlock]
  
  /**
  	 * Removes all dependencies and blocks
  	 */
  def clearDependenciesAndBlocks(): Unit
  
  var dependencies: js.Array[Dependency]
  
  def deserialize(__0: Read): Unit
  
  def getRootBlock(): DependenciesBlock
  
  var parent: DependenciesBlock
  
  def removeDependency(dependency: Dependency): Unit
  
  def serialize(__0: Write): Unit
  
  def updateHash(hash: Hash, context: UpdateHashContextDependency): Unit
}
object DependenciesBlock {
  
  inline def apply(
    addBlock: AsyncDependenciesBlock => Callback,
    addDependency: Dependency => Callback,
    blocks: js.Array[AsyncDependenciesBlock],
    clearDependenciesAndBlocks: Callback,
    dependencies: js.Array[Dependency],
    deserialize: Read => Callback,
    getRootBlock: CallbackTo[DependenciesBlock],
    parent: DependenciesBlock,
    removeDependency: Dependency => Callback,
    serialize: Write => Callback,
    updateHash: (Hash, UpdateHashContextDependency) => Callback
  ): DependenciesBlock = {
    val __obj = js.Dynamic.literal(addBlock = js.Any.fromFunction1((t0: AsyncDependenciesBlock) => addBlock(t0).runNow()), addDependency = js.Any.fromFunction1((t0: Dependency) => addDependency(t0).runNow()), blocks = blocks.asInstanceOf[js.Any], clearDependenciesAndBlocks = clearDependenciesAndBlocks.toJsFn, dependencies = dependencies.asInstanceOf[js.Any], deserialize = js.Any.fromFunction1((t0: Read) => deserialize(t0).runNow()), getRootBlock = getRootBlock.toJsFn, parent = parent.asInstanceOf[js.Any], removeDependency = js.Any.fromFunction1((t0: Dependency) => removeDependency(t0).runNow()), serialize = js.Any.fromFunction1((t0: Write) => serialize(t0).runNow()), updateHash = js.Any.fromFunction2((t0: Hash, t1: UpdateHashContextDependency) => (updateHash(t0, t1)).runNow()))
    __obj.asInstanceOf[DependenciesBlock]
  }
  
  extension [Self <: DependenciesBlock](x: Self) {
    
    inline def setAddBlock(value: AsyncDependenciesBlock => Callback): Self = StObject.set(x, "addBlock", js.Any.fromFunction1((t0: AsyncDependenciesBlock) => value(t0).runNow()))
    
    inline def setAddDependency(value: Dependency => Callback): Self = StObject.set(x, "addDependency", js.Any.fromFunction1((t0: Dependency) => value(t0).runNow()))
    
    inline def setBlocks(value: js.Array[AsyncDependenciesBlock]): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksVarargs(value: AsyncDependenciesBlock*): Self = StObject.set(x, "blocks", js.Array(value*))
    
    inline def setClearDependenciesAndBlocks(value: Callback): Self = StObject.set(x, "clearDependenciesAndBlocks", value.toJsFn)
    
    inline def setDependencies(value: js.Array[Dependency]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: Dependency*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDeserialize(value: Read => Callback): Self = StObject.set(x, "deserialize", js.Any.fromFunction1((t0: Read) => value(t0).runNow()))
    
    inline def setGetRootBlock(value: CallbackTo[DependenciesBlock]): Self = StObject.set(x, "getRootBlock", value.toJsFn)
    
    inline def setParent(value: DependenciesBlock): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRemoveDependency(value: Dependency => Callback): Self = StObject.set(x, "removeDependency", js.Any.fromFunction1((t0: Dependency) => value(t0).runNow()))
    
    inline def setSerialize(value: Write => Callback): Self = StObject.set(x, "serialize", js.Any.fromFunction1((t0: Write) => value(t0).runNow()))
    
    inline def setUpdateHash(value: (Hash, UpdateHashContextDependency) => Callback): Self = StObject.set(x, "updateHash", js.Any.fromFunction2((t0: Hash, t1: UpdateHashContextDependency) => (value(t0, t1)).runNow()))
  }
}
