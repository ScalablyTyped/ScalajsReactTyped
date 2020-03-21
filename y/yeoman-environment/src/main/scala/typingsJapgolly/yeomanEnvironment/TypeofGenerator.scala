package typingsJapgolly.yeomanEnvironment

import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.yeomanGenerator.mod.MemFsEditor
import typingsJapgolly.yeomanGenerator.mod.Storage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofGenerator extends js.Object {
  var Storage: Instantiable3[
    /* name */ String, 
    /* fs */ MemFsEditor, 
    /* configPath */ String, 
    typingsJapgolly.yeomanGenerator.mod.Storage
  ]
}

object TypeofGenerator {
  @scala.inline
  def apply(Storage: Instantiable3[/* name */ String, /* fs */ MemFsEditor, /* configPath */ String, Storage]): TypeofGenerator = {
    val __obj = js.Dynamic.literal(Storage = Storage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofGenerator]
  }
}

