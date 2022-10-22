package typingsJapgolly.lodashDecorators

import typingsJapgolly.lodashDecorators.anon.Post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object applicatorsMod {
  
  /* note: abstract class */ @JSImport("lodash-decorators/applicators", "Applicator")
  @js.native
  open class Applicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsApplicatorMod.Applicator
  
  @JSImport("lodash-decorators/applicators", "BindApplicator")
  @js.native
  open class BindApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsBindApplicatorMod.BindApplicator
  
  @JSImport("lodash-decorators/applicators", "ComposeApplicator")
  @js.native
  open class ComposeApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsComposeApplicatorMod.ComposeApplicator {
    def this(_config: Post) = this()
  }
  
  @JSImport("lodash-decorators/applicators", "InvokeApplicator")
  @js.native
  open class InvokeApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsInvokeApplicatorMod.InvokeApplicator
  
  @JSImport("lodash-decorators/applicators", "MemoizeApplicator")
  @js.native
  open class MemoizeApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsMemoizeApplicatorMod.MemoizeApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialApplicator")
  @js.native
  open class PartialApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsPartialApplicatorMod.PartialApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialValueApplicator")
  @js.native
  open class PartialValueApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsPartialValueApplicatorMod.PartialValueApplicator
  
  @JSImport("lodash-decorators/applicators", "PartialedApplicator")
  @js.native
  open class PartialedApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsPartialedApplicatorMod.PartialedApplicator
  
  @JSImport("lodash-decorators/applicators", "PostValueApplicator")
  @js.native
  open class PostValueApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsPostValueApplicatorMod.PostValueApplicator
  
  @JSImport("lodash-decorators/applicators", "PreValueApplicator")
  @js.native
  open class PreValueApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsPreValueApplicatorMod.PreValueApplicator
  
  @JSImport("lodash-decorators/applicators", "WrapApplicator")
  @js.native
  open class WrapApplicator ()
    extends typingsJapgolly.lodashDecorators.applicatorsWrapApplicatorMod.WrapApplicator
}
