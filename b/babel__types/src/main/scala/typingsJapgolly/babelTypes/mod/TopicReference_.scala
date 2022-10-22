package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.TopicReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait TopicReference_
  extends StObject
     with BaseNode
     with Expression {
  
  @JSName("type")
  var type_TopicReference_ : TopicReference
}
object TopicReference_ {
  
  inline def apply(): TopicReference_ = {
    val __obj = js.Dynamic.literal(end = null, innerComments = null, leadingComments = null, loc = null, start = null, trailingComments = null)
    __obj.updateDynamic("type")("TopicReference")
    __obj.asInstanceOf[TopicReference_]
  }
  
  extension [Self <: TopicReference_](x: Self) {
    
    inline def setType(value: TopicReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
