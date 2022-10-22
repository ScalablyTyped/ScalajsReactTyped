package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Attr")
@js.native
open class Attr ()
  extends typingsJapgolly.nodegit.attrMod.Attr
/* static members */
object Attr {
  
  @JSImport("nodegit", "Attr")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addMacro(repo: typingsJapgolly.nodegit.repositoryMod.Repository, name: String, values: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addMacro")(repo.asInstanceOf[js.Any], name.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def cacheFlush(repo: typingsJapgolly.nodegit.repositoryMod.Repository): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cacheFlush")(repo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @param repo - The repository containing the path.
    * @param flags - A combination of GIT_ATTR_CHECK... flags.
    * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
    * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
    * @param name - The name of the attribute to look up.
    * @returns - Output of the value of the attribute. Use the GIT_ATTR_...
    */
  inline def get(repo: typingsJapgolly.nodegit.repositoryMod.Repository, flags: Double, path: String, name: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(repo.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], path.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  /**
    * @param repo - The repository containing the path.
    * @param flags - A combination of GIT_ATTR_CHECK... flags.
    * @param path - The path to check for attributes. Relative paths are interpreted relative to the repo root.
    * The file does not have to exist, but if it does not, then it will be treated as a plain file (not a directory).
    * @param numAttr - The number of attributes being looked up
    * @param names - An array of num_attr strings containing attribute names.
    */
  inline def getMany(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    flags: Double,
    path: String,
    numAttr: Double,
    names: String
  ): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMany")(repo.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], path.asInstanceOf[js.Any], numAttr.asInstanceOf[js.Any], names.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  /**
    * @param attr - The attribute
    * @returns - the value type for the attribute
    */
  inline def value(attr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("value")(attr.asInstanceOf[js.Any]).asInstanceOf[Double]
}
