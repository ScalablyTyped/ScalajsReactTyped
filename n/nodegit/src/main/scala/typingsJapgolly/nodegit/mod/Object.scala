package typingsJapgolly.nodegit.mod

import typingsJapgolly.nodegit.objectMod.Object.TYPE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Object")
@js.native
open class Object ()
  extends typingsJapgolly.nodegit.objectMod.Object
/* static members */
object Object {
  
  @JSImport("nodegit", "Object")
  @js.native
  val ^ : js.Any = js.native
  
  inline def lookup(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    `type`: TYPE
  ): js.Promise[typingsJapgolly.nodegit.objectMod.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.objectMod.Object]]
  
  inline def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double,
    `type`: TYPE
  ): js.Promise[typingsJapgolly.nodegit.objectMod.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.objectMod.Object]]
  
  inline def size(`type`: TYPE): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def string2Type(str: String): TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("string2Type")(str.asInstanceOf[js.Any]).asInstanceOf[TYPE]
  
  inline def type2String(`type`: TYPE): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type2String")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def typeisloose(`type`: TYPE): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("typeisloose")(`type`.asInstanceOf[js.Any]).asInstanceOf[Double]
}
