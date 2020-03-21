package typingsJapgolly.gitlab

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gitlab/dist/types/core/infrastructure/Utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  @js.native
  trait Bundle[T /* <: StringDictionary[Constructor] */, P /* <: String */]
    extends Instantiable0[Mapper[T, P]]
       with Instantiable1[/* options */ js.Any, Mapper[T, P]]
  
  @js.native
  trait Constructor
    extends Instantiable1[/* args */ js.Any, js.Any]
  
  def bundler[T /* <: StringDictionary[Constructor] */, P /* <: String */](services: T): Bundle[T, P] = js.native
  type Mapper[T /* <: StringDictionary[Constructor] */, P /* <: String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ name in P ]: std.InstanceType<T[name]>}
    */ typingsJapgolly.gitlab.gitlabStrings.Mapper with T
}

