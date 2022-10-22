package typingsJapgolly.babelTypes.anon

import typingsJapgolly.babelTypes.mod.JSXElement_
import typingsJapgolly.babelTypes.mod.JSXEmptyExpression_
import typingsJapgolly.babelTypes.mod.JSXExpressionContainer_
import typingsJapgolly.babelTypes.mod.JSXFragment_
import typingsJapgolly.babelTypes.mod.JSXSpreadChild_
import typingsJapgolly.babelTypes.mod.JSXText_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: js.Array[
    JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
  ]
}
object Children {
  
  inline def apply(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
    ]
  ): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  extension [Self <: Children](x: Self) {
    
    inline def setChildren(
      value: js.Array[
          JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_
        ]
    ): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(
      value: (JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | JSXFragment_ | JSXEmptyExpression_)*
    ): Self = StObject.set(x, "children", js.Array(value*))
  }
}
