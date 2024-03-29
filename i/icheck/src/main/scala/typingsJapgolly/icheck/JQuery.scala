package typingsJapgolly.icheck

import typingsJapgolly.icheck.ICheck.Options
import typingsJapgolly.icheck.icheckStrings.check
import typingsJapgolly.icheck.icheckStrings.destroy
import typingsJapgolly.icheck.icheckStrings.determinate
import typingsJapgolly.icheck.icheckStrings.disable
import typingsJapgolly.icheck.icheckStrings.enable
import typingsJapgolly.icheck.icheckStrings.indeterminate
import typingsJapgolly.icheck.icheckStrings.toggle
import typingsJapgolly.icheck.icheckStrings.uncheck
import typingsJapgolly.icheck.icheckStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQuery extends StObject {
  
  def iCheck(): this.type = js.native
  def iCheck(options: Options): this.type = js.native
  def iCheck[T /* <: /* keyof icheck.ICheck.Methods */ check | uncheck | toggle | disable | enable | indeterminate | determinate | update | destroy */](method: T): this.type = js.native
  def iCheck[T /* <: /* keyof icheck.ICheck.Methods */ check | uncheck | toggle | disable | enable | indeterminate | determinate | update | destroy */](
    method: T,
    callback: /* import warning: importer.ImportType#apply Failed type conversion: icheck.ICheck.Methods[T] */ js.Any
  ): this.type = js.native
}
