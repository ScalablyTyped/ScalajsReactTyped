package typingsJapgolly.breeze.global.breeze

import typingsJapgolly.breeze.anon.MergeAdds
import typingsJapgolly.breeze.breeze.EntityManagerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("breeze.EntityManager")
@js.native
open class EntityManager ()
  extends StObject
     with typingsJapgolly.breeze.breeze.EntityManager {
  def this(config: String) = this()
  def this(config: EntityManagerOptions) = this()
}
/* static members */
object EntityManager {
  
  @JSGlobal("breeze.EntityManager")
  @js.native
  val ^ : js.Any = js.native
  
  inline def importEntities(exportedData: js.Object): typingsJapgolly.breeze.breeze.EntityManager = ^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedData.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.EntityManager]
  inline def importEntities(exportedData: js.Object, config: MergeAdds): typingsJapgolly.breeze.breeze.EntityManager = (^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedData.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.EntityManager]
  inline def importEntities(exportedString: String): typingsJapgolly.breeze.breeze.EntityManager = ^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.breeze.breeze.EntityManager]
  inline def importEntities(exportedString: String, config: MergeAdds): typingsJapgolly.breeze.breeze.EntityManager = (^.asInstanceOf[js.Dynamic].applyDynamic("importEntities")(exportedString.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.breeze.breeze.EntityManager]
}
