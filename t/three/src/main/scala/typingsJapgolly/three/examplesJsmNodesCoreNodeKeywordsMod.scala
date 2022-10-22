package typingsJapgolly.three

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object examplesJsmNodesCoreNodeKeywordsMod {
  
  @JSImport("three/examples/jsm/nodes/core/NodeKeywords", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with NodeKeywords {
    
    /* CompleteClass */
    override def addKeyword(
      name: String,
      callback: js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
    ): Unit = js.native
    
    /* CompleteClass */
    override def getNode(name: String): typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default = js.native
    
    /* CompleteClass */
    override def include(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, code: String): Unit = js.native
    
    /* CompleteClass */
    var keywords: js.Array[String] = js.native
    
    /* CompleteClass */
    var keywordsCallback: StringDictionary[
        js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
      ] = js.native
    
    /* CompleteClass */
    var nodes: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
    
    /* CompleteClass */
    override def parse(code: String): js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default] = js.native
  }
  
  trait NodeKeywords extends StObject {
    
    def addKeyword(
      name: String,
      callback: js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
    ): Unit
    
    def getNode(name: String): typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default
    
    def include(builder: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, code: String): Unit
    
    var keywords: js.Array[String]
    
    var keywordsCallback: StringDictionary[
        js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
      ]
    
    var nodes: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
    
    def parse(code: String): js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
  }
  object NodeKeywords {
    
    inline def apply(
      addKeyword: (String, js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]) => Callback,
      getNode: String => typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default,
      include: (typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, String) => Callback,
      keywords: js.Array[String],
      keywordsCallback: StringDictionary[
          js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
        ],
      nodes: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default],
      parse: String => js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
    ): NodeKeywords = {
      val __obj = js.Dynamic.literal(addKeyword = js.Any.fromFunction2((t0: String, t1: js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]) => (addKeyword(t0, t1)).runNow()), getNode = js.Any.fromFunction1(getNode), include = js.Any.fromFunction2((t0: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, t1: String) => (include(t0, t1)).runNow()), keywords = keywords.asInstanceOf[js.Any], keywordsCallback = keywordsCallback.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[NodeKeywords]
    }
    
    extension [Self <: NodeKeywords](x: Self) {
      
      inline def setAddKeyword(
        value: (String, js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]) => Callback
      ): Self = StObject.set(x, "addKeyword", js.Any.fromFunction2((t0: String, t1: js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]) => (value(t0, t1)).runNow()))
      
      inline def setGetNode(value: String => typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default): Self = StObject.set(x, "getNode", js.Any.fromFunction1(value))
      
      inline def setInclude(value: (typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, String) => Callback): Self = StObject.set(x, "include", js.Any.fromFunction2((t0: typingsJapgolly.three.examplesJsmNodesCoreNodeBuilderMod.default, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setKeywords(value: js.Array[String]): Self = StObject.set(x, "keywords", value.asInstanceOf[js.Any])
      
      inline def setKeywordsCallback(
        value: StringDictionary[
              js.Function1[/* name */ String, typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]
            ]
      ): Self = StObject.set(x, "keywordsCallback", value.asInstanceOf[js.Any])
      
      inline def setKeywordsVarargs(value: String*): Self = StObject.set(x, "keywords", js.Array(value*))
      
      inline def setNodes(value: js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      inline def setNodesVarargs(value: typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default*): Self = StObject.set(x, "nodes", js.Array(value*))
      
      inline def setParse(value: String => js.Array[typingsJapgolly.three.examplesJsmNodesCoreNodeMod.default]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
}
