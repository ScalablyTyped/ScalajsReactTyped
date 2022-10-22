package typingsJapgolly.baiduApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Keyword extends StObject {
  
  // 标签结果数组
  var keyword: String
  
  // 置信度，0-1
  var root: String
  
  // 图片中的物体或场景名称
  var score: Double
}
object Keyword {
  
  inline def apply(keyword: String, root: String, score: Double): Keyword = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[Keyword]
  }
  
  extension [Self <: Keyword](x: Self) {
    
    inline def setKeyword(value: String): Self = StObject.set(x, "keyword", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
