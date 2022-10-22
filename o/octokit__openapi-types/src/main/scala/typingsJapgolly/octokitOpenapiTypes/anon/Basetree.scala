package typingsJapgolly.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basetree extends StObject {
  
  /**
    * @description The SHA1 of an existing Git tree object which will be used as the base for the new tree. If provided, a new Git tree object will be created from entries in the Git tree object pointed to by `base_tree` and entries defined in the `tree` parameter. Entries defined in the `tree` parameter will overwrite items from `base_tree` with the same `path`. If you're creating new changes on a branch, then normally you'd set `base_tree` to the SHA1 of the Git tree object of the current latest commit on the branch you're working on.
    * If not provided, GitHub will create a new Git tree object from only the entries defined in the `tree` parameter. If you create a new commit pointing to such a tree, then all files which were a part of the parent commit's tree and were not defined in the `tree` parameter will be listed as deleted by the new commit.
    */
  var base_tree: js.UndefOr[String] = js.undefined
  
  /** @description Objects (of `path`, `mode`, `type`, and `sha`) specifying a tree structure. */
  var tree: js.Array[ContentMode]
}
object Basetree {
  
  inline def apply(tree: js.Array[ContentMode]): Basetree = {
    val __obj = js.Dynamic.literal(tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basetree]
  }
  
  extension [Self <: Basetree](x: Self) {
    
    inline def setBase_tree(value: String): Self = StObject.set(x, "base_tree", value.asInstanceOf[js.Any])
    
    inline def setBase_treeUndefined: Self = StObject.set(x, "base_tree", js.undefined)
    
    inline def setTree(value: js.Array[ContentMode]): Self = StObject.set(x, "tree", value.asInstanceOf[js.Any])
    
    inline def setTreeVarargs(value: ContentMode*): Self = StObject.set(x, "tree", js.Array(value*))
  }
}
