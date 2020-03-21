package typingsJapgolly.hexo.mod.extend

import japgolly.scalajs.react.Callback
import typingsJapgolly.hexo.mod.Site
import typingsJapgolly.hexo.mod.extend.Generator.Return
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generator_ extends js.Object {
  def register(name: String, fn: js.Function1[/* locals */ Site, Return | js.Array[Return]]): Unit
}

object Generator_ {
  @scala.inline
  def apply(register: (String, js.Function1[/* locals */ Site, Return | js.Array[Return]]) => Callback): Generator_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("register")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[
  /* locals */ typingsJapgolly.hexo.mod.Site, 
  typingsJapgolly.hexo.mod.extend.Generator.Return | js.Array[typingsJapgolly.hexo.mod.extend.Generator.Return]]) => register(t0, t1).runNow()))
    __obj.asInstanceOf[Generator_]
  }
}

