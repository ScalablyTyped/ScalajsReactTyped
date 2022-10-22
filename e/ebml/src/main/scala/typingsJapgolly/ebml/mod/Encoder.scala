package typingsJapgolly.ebml.mod

import typingsJapgolly.ebml.anon.PickTagStackItemend
import typingsJapgolly.ebml.mod.Encoder.TagStackItem
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ebml", "Encoder")
@js.native
open class Encoder () extends Transform {
  def this(opts: TransformOptions) = this()
  
  var buffer: Buffer = js.native
  
  var corked: Boolean = js.native
  
  def endTag(): Unit = js.native
  
  var stack: js.Array[TagStackItem] = js.native
  
  /**
    * @param tagName The name of the tag to start
    * @param info an information object with an `end` parameter
    */
  @JSName("startTag")
  def startTag_name(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    info: PickTagStackItemend
  ): Unit = js.native
  
  @JSName("writeTag")
  def writeTag_name(
    tagName: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any,
    tagData: Buffer
  ): Unit = js.native
}
/* static members */
object Encoder {
  
  @JSImport("ebml", "Encoder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * gets the ID of the type of `tagName`
    * @param tagName tag name to be looked up
    * @return tag ID
    */
  inline def getSchemaInfo(tagName: String): Double | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaInfo")(tagName.asInstanceOf[js.Any]).asInstanceOf[Double | Null]
  
  trait TagStackItem extends StObject {
    
    var children: js.Array[TagStackItem]
    
    var data: Buffer | Null
    
    var end: Double
    
    var id: ReturnType[js.Function1[/* tagName */ String, Double | Null]]
    
    var name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
  }
  object TagStackItem {
    
    inline def apply(
      children: js.Array[TagStackItem],
      end: Double,
      id: ReturnType[js.Function1[/* tagName */ String, Double | Null]],
      name: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
    ): TagStackItem = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], data = null)
      __obj.asInstanceOf[TagStackItem]
    }
    
    extension [Self <: TagStackItem](x: Self) {
      
      inline def setChildren(value: js.Array[TagStackItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: TagStackItem*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setId(value: ReturnType[js.Function1[/* tagName */ String, Double | Null]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(
        value: /* import warning: importer.ImportType#apply Failed type conversion: ebml.ebml.EBMLTagSchema['name'] */ js.Any
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
