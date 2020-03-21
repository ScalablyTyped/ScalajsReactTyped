package typingsJapgolly.lodashDecorators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lodash-decorators/applicators", JSImport.Namespace)
@js.native
object applicatorsMod extends js.Object {
  @js.native
  abstract class Applicator ()
    extends typingsJapgolly.lodashDecorators.applicatorMod.Applicator
  
  @js.native
  class BindApplicator ()
    extends typingsJapgolly.lodashDecorators.bindApplicatorMod.BindApplicator
  
  @js.native
  class ComposeApplicator ()
    extends typingsJapgolly.lodashDecorators.composeApplicatorMod.ComposeApplicator {
    def this(_config: AnonPost) = this()
  }
  
  @js.native
  class InvokeApplicator ()
    extends typingsJapgolly.lodashDecorators.invokeApplicatorMod.InvokeApplicator
  
  @js.native
  class MemoizeApplicator ()
    extends typingsJapgolly.lodashDecorators.memoizeApplicatorMod.MemoizeApplicator
  
  @js.native
  class PartialApplicator ()
    extends typingsJapgolly.lodashDecorators.partialApplicatorMod.PartialApplicator
  
  @js.native
  class PartialValueApplicator ()
    extends typingsJapgolly.lodashDecorators.partialValueApplicatorMod.PartialValueApplicator
  
  @js.native
  class PartialedApplicator ()
    extends typingsJapgolly.lodashDecorators.partialedApplicatorMod.PartialedApplicator
  
  @js.native
  class PostValueApplicator ()
    extends typingsJapgolly.lodashDecorators.postValueApplicatorMod.PostValueApplicator
  
  @js.native
  class PreValueApplicator ()
    extends typingsJapgolly.lodashDecorators.preValueApplicatorMod.PreValueApplicator
  
  @js.native
  class WrapApplicator ()
    extends typingsJapgolly.lodashDecorators.wrapApplicatorMod.WrapApplicator
  
}

