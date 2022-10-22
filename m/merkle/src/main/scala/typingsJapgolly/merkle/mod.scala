package typingsJapgolly.merkle

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.merkle.merkleStrings.md5
import typingsJapgolly.merkle.merkleStrings.none
import typingsJapgolly.merkle.merkleStrings.ripemd160
import typingsJapgolly.merkle.merkleStrings.sha1
import typingsJapgolly.merkle.merkleStrings.sha256
import typingsJapgolly.merkle.merkleStrings.sha512
import typingsJapgolly.merkle.merkleStrings.whirlpool
import typingsJapgolly.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(hashname: sha512 | sha256 | sha1 | md5 | ripemd160 | whirlpool | none): MerkleStream = ^.asInstanceOf[js.Dynamic].apply(hashname.asInstanceOf[js.Any]).asInstanceOf[MerkleStream]
  inline def apply(
    hashname: sha512 | sha256 | sha1 | md5 | ripemd160 | whirlpool | none,
    useUpperCaseForHash: Boolean
  ): MerkleStream = (^.asInstanceOf[js.Dynamic].apply(hashname.asInstanceOf[js.Any], useUpperCaseForHash.asInstanceOf[js.Any])).asInstanceOf[MerkleStream]
  
  @JSImport("merkle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait MerkleStream extends Transform {
    
    def async(leaves: js.Array[Any], callback: js.Function2[/* err */ String, /* tree */ MerkleTree, Unit]): Unit = js.native
    
    def json(): MerkleStream = js.native
    
    def sync(leaves: js.Array[Any]): MerkleTree = js.native
  }
  
  trait MerkleTree extends StObject {
    
    def depth(): Double
    
    def level(level: Double): js.UndefOr[Double]
    
    def levels(): Double
    
    def nodes(): Double
    
    def root(): String
  }
  object MerkleTree {
    
    inline def apply(
      depth: CallbackTo[Double],
      level: Double => js.UndefOr[Double],
      levels: CallbackTo[Double],
      nodes: CallbackTo[Double],
      root: CallbackTo[String]
    ): MerkleTree = {
      val __obj = js.Dynamic.literal(depth = depth.toJsFn, level = js.Any.fromFunction1(level), levels = levels.toJsFn, nodes = nodes.toJsFn, root = root.toJsFn)
      __obj.asInstanceOf[MerkleTree]
    }
    
    extension [Self <: MerkleTree](x: Self) {
      
      inline def setDepth(value: CallbackTo[Double]): Self = StObject.set(x, "depth", value.toJsFn)
      
      inline def setLevel(value: Double => js.UndefOr[Double]): Self = StObject.set(x, "level", js.Any.fromFunction1(value))
      
      inline def setLevels(value: CallbackTo[Double]): Self = StObject.set(x, "levels", value.toJsFn)
      
      inline def setNodes(value: CallbackTo[Double]): Self = StObject.set(x, "nodes", value.toJsFn)
      
      inline def setRoot(value: CallbackTo[String]): Self = StObject.set(x, "root", value.toJsFn)
    }
  }
}
