package typingsJapgolly.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildRepository extends js.Object {
  /**
    * Indicates whether to checkout submodules.
    */
  var checkoutSubmodules: Boolean
  /**
    * Indicates whether to clean the target folder when getting code from the repository.
    */
  var clean: String
  /**
    * The name of the default branch.
    */
  var defaultBranch: String
  /**
    * The ID of the repository.
    */
  var id: String
  /**
    * The friendly name of the repository.
    */
  var name: String
  var properties: StringDictionary[String]
  /**
    * The root folder.
    */
  var rootFolder: String
  /**
    * The type of the repository.
    */
  var `type`: String
  /**
    * The URL of the repository.
    */
  var url: String
}

object BuildRepository {
  @scala.inline
  def apply(
    checkoutSubmodules: Boolean,
    clean: String,
    defaultBranch: String,
    id: String,
    name: String,
    properties: StringDictionary[String],
    rootFolder: String,
    `type`: String,
    url: String
  ): BuildRepository = {
    val __obj = js.Dynamic.literal(checkoutSubmodules = checkoutSubmodules.asInstanceOf[js.Any], clean = clean.asInstanceOf[js.Any], defaultBranch = defaultBranch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], rootFolder = rootFolder.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildRepository]
  }
}

