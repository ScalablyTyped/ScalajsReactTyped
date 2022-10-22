package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.Env
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 云开发
// 文档：https://smartprogram.baidu.com/docs/develop/tutorial/codedir/
trait Cloud extends StObject {
  
  /**
    * 接受一个 name 参数，指定需引用的集合名称
    */
  def collection(name: String): js.Object
  
  /**
    * 接受一个可选对象参数 env：环境 ID，获取数据库的引用
    */
  def database(options: Env): js.Object
  
  /**
    * 初始化方法（全局只需一次）
    */
  def init(options: InitCloudOptions): Unit
}
object Cloud {
  
  inline def apply(collection: String => js.Object, database: Env => js.Object, init: InitCloudOptions => Callback): Cloud = {
    val __obj = js.Dynamic.literal(collection = js.Any.fromFunction1(collection), database = js.Any.fromFunction1(database), init = js.Any.fromFunction1((t0: InitCloudOptions) => init(t0).runNow()))
    __obj.asInstanceOf[Cloud]
  }
  
  extension [Self <: Cloud](x: Self) {
    
    inline def setCollection(value: String => js.Object): Self = StObject.set(x, "collection", js.Any.fromFunction1(value))
    
    inline def setDatabase(value: Env => js.Object): Self = StObject.set(x, "database", js.Any.fromFunction1(value))
    
    inline def setInit(value: InitCloudOptions => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: InitCloudOptions) => value(t0).runNow()))
  }
}
