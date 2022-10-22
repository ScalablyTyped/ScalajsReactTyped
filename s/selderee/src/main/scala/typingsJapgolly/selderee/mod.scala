package typingsJapgolly.selderee

import typingsJapgolly.selderee.libTypesMod.BuilderFunction
import typingsJapgolly.selderee.libTypesMod.MatcherFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("selderee", "DecisionTree")
  @js.native
  open class DecisionTree[V] protected ()
    extends typingsJapgolly.selderee.libDecisionTreeMod.DecisionTree[V] {
    /**
      * Create new DecisionTree object.
      *
      * @param input - an array containing all selectors
      * paired with associated values.
      *
      * @typeParam V - the type of values associated with selectors.
      */
    def this(input: js.Array[js.Tuple2[String, V]]) = this()
  }
  
  @JSImport("selderee", "Picker")
  @js.native
  open class Picker[L, V] protected ()
    extends typingsJapgolly.selderee.libPickerMod.Picker[L, V] {
    /**
      * Create new Picker object.
      *
      * @typeParam L - the type of HTML Element in the targeted DOM AST.
      * @typeParam V - the type of associated values.
      *
      * @param f - the function that matches an element
      * and returns all associated values.
      */
    def this(f: MatcherFunction[L, V]) = this()
  }
  
  object Treeify {
    
    @JSImport("selderee", "Treeify.treeify")
    @js.native
    val treeify: BuilderFunction[String, String] = js.native
  }
}
