package typingsJapgolly.breeze.mod

import typingsJapgolly.breeze.anon.IsCaseSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("breeze", "LocalQueryComparisonOptions")
@js.native
open class LocalQueryComparisonOptions protected ()
  extends StObject
     with typingsJapgolly.breeze.breeze.LocalQueryComparisonOptions {
  def this(config: IsCaseSensitive) = this()
  
  /* CompleteClass */
  override def setAsDefault(): Unit = js.native
}
/* static members */
object LocalQueryComparisonOptions {
  
  @JSImport("breeze", "LocalQueryComparisonOptions")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("breeze", "LocalQueryComparisonOptions.caseInsensitiveSQL")
  @js.native
  def caseInsensitiveSQL: typingsJapgolly.breeze.breeze.LocalQueryComparisonOptions = js.native
  inline def caseInsensitiveSQL_=(x: typingsJapgolly.breeze.breeze.LocalQueryComparisonOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caseInsensitiveSQL")(x.asInstanceOf[js.Any])
  
  @JSImport("breeze", "LocalQueryComparisonOptions.defaultInstance")
  @js.native
  def defaultInstance: typingsJapgolly.breeze.breeze.LocalQueryComparisonOptions = js.native
  inline def defaultInstance_=(x: typingsJapgolly.breeze.breeze.LocalQueryComparisonOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultInstance")(x.asInstanceOf[js.Any])
}
