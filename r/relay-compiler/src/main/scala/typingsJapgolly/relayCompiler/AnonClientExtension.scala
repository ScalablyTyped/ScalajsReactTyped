package typingsJapgolly.relayCompiler

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.relayCompiler.iRMod.Argument
import typingsJapgolly.relayCompiler.iRMod.ClientExtension
import typingsJapgolly.relayCompiler.iRMod.Condition
import typingsJapgolly.relayCompiler.iRMod.Defer
import typingsJapgolly.relayCompiler.iRMod.Directive
import typingsJapgolly.relayCompiler.iRMod.Fragment
import typingsJapgolly.relayCompiler.iRMod.FragmentSpread
import typingsJapgolly.relayCompiler.iRMod.InlineDataFragmentSpread
import typingsJapgolly.relayCompiler.iRMod.InlineFragment
import typingsJapgolly.relayCompiler.iRMod.LinkedField
import typingsJapgolly.relayCompiler.iRMod.Literal
import typingsJapgolly.relayCompiler.iRMod.LocalArgumentDefinition
import typingsJapgolly.relayCompiler.iRMod.ModuleImport
import typingsJapgolly.relayCompiler.iRMod.Request
import typingsJapgolly.relayCompiler.iRMod.Root
import typingsJapgolly.relayCompiler.iRMod.RootArgumentDefinition
import typingsJapgolly.relayCompiler.iRMod.ScalarField
import typingsJapgolly.relayCompiler.iRMod.SplitOperation
import typingsJapgolly.relayCompiler.iRMod.Stream
import typingsJapgolly.relayCompiler.iRMod.Variable
import typingsJapgolly.relayCompiler.irvisitorMod.NodeVisitorObject
import typingsJapgolly.relayCompiler.irvisitorMod.VisitFn
import typingsJapgolly.relayCompiler.irvisitorMod.VisitNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClientExtension extends js.Object {
  var Argument: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Argument]] = js.undefined
  var ClientExtension: js.UndefOr[VisitFn[typingsJapgolly.relayCompiler.iRMod.ClientExtension]] = js.undefined
  var Condition: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Condition]] = js.undefined
  var Defer: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Defer]] = js.undefined
  var Directive: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Directive]] = js.undefined
  var Fragment: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Fragment]] = js.undefined
  var FragmentSpread: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.FragmentSpread]] = js.undefined
  var InlineDataFragmentSpread: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.InlineDataFragmentSpread]] = js.undefined
  var InlineFragment: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.InlineFragment]] = js.undefined
  var LinkedField: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.LinkedField]] = js.undefined
  var Literal: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Literal]] = js.undefined
  var LocalArgumentDefinition: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.LocalArgumentDefinition]] = js.undefined
  var ModuleImport: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.ModuleImport]] = js.undefined
  var Request: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Request]] = js.undefined
  var Root: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Root]] = js.undefined
  var RootArgumentDefinition: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.RootArgumentDefinition]] = js.undefined
  var ScalarField: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.ScalarField]] = js.undefined
  var SplitOperation: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.SplitOperation]] = js.undefined
  var Stream: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Stream]] = js.undefined
  var Variable: js.UndefOr[NodeVisitorObject[typingsJapgolly.relayCompiler.iRMod.Variable]] = js.undefined
}

object AnonClientExtension {
  @scala.inline
  def apply(
    Argument: NodeVisitorObject[Argument] = null,
    ClientExtension: (ClientExtension, /* key */ js.UndefOr[js.Any], /* parent */ js.UndefOr[Null | VisitNode | js.Array[VisitNode]], /* path */ js.UndefOr[js.Array[js.Any]], /* ancestors */ js.UndefOr[js.Array[VisitNode | js.Array[VisitNode]]]) => CallbackTo[
      // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
    ] = null,
    Condition: NodeVisitorObject[Condition] = null,
    Defer: NodeVisitorObject[Defer] = null,
    Directive: NodeVisitorObject[Directive] = null,
    Fragment: NodeVisitorObject[Fragment] = null,
    FragmentSpread: NodeVisitorObject[FragmentSpread] = null,
    InlineDataFragmentSpread: NodeVisitorObject[InlineDataFragmentSpread] = null,
    InlineFragment: NodeVisitorObject[InlineFragment] = null,
    LinkedField: NodeVisitorObject[LinkedField] = null,
    Literal: NodeVisitorObject[Literal] = null,
    LocalArgumentDefinition: NodeVisitorObject[LocalArgumentDefinition] = null,
    ModuleImport: NodeVisitorObject[ModuleImport] = null,
    Request: NodeVisitorObject[Request] = null,
    Root: NodeVisitorObject[Root] = null,
    RootArgumentDefinition: NodeVisitorObject[RootArgumentDefinition] = null,
    ScalarField: NodeVisitorObject[ScalarField] = null,
    SplitOperation: NodeVisitorObject[SplitOperation] = null,
    Stream: NodeVisitorObject[Stream] = null,
    Variable: NodeVisitorObject[Variable] = null
  ): AnonClientExtension = {
    val __obj = js.Dynamic.literal()
    if (Argument != null) __obj.updateDynamic("Argument")(Argument.asInstanceOf[js.Any])
    if (ClientExtension != null) __obj.updateDynamic("ClientExtension")(js.Any.fromFunction5((t0: typingsJapgolly.relayCompiler.iRMod.ClientExtension, t1: /* key */ js.UndefOr[js.Any], t2: /* parent */ js.UndefOr[
  scala.Null | typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]], t3: /* path */ js.UndefOr[js.Array[js.Any]], t4: /* ancestors */ js.UndefOr[
  js.Array[
    typingsJapgolly.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsJapgolly.relayCompiler.irvisitorMod.VisitNode]
  ]]) => ClientExtension(t0, t1, t2, t3, t4).runNow()))
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (Defer != null) __obj.updateDynamic("Defer")(Defer.asInstanceOf[js.Any])
    if (Directive != null) __obj.updateDynamic("Directive")(Directive.asInstanceOf[js.Any])
    if (Fragment != null) __obj.updateDynamic("Fragment")(Fragment.asInstanceOf[js.Any])
    if (FragmentSpread != null) __obj.updateDynamic("FragmentSpread")(FragmentSpread.asInstanceOf[js.Any])
    if (InlineDataFragmentSpread != null) __obj.updateDynamic("InlineDataFragmentSpread")(InlineDataFragmentSpread.asInstanceOf[js.Any])
    if (InlineFragment != null) __obj.updateDynamic("InlineFragment")(InlineFragment.asInstanceOf[js.Any])
    if (LinkedField != null) __obj.updateDynamic("LinkedField")(LinkedField.asInstanceOf[js.Any])
    if (Literal != null) __obj.updateDynamic("Literal")(Literal.asInstanceOf[js.Any])
    if (LocalArgumentDefinition != null) __obj.updateDynamic("LocalArgumentDefinition")(LocalArgumentDefinition.asInstanceOf[js.Any])
    if (ModuleImport != null) __obj.updateDynamic("ModuleImport")(ModuleImport.asInstanceOf[js.Any])
    if (Request != null) __obj.updateDynamic("Request")(Request.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (RootArgumentDefinition != null) __obj.updateDynamic("RootArgumentDefinition")(RootArgumentDefinition.asInstanceOf[js.Any])
    if (ScalarField != null) __obj.updateDynamic("ScalarField")(ScalarField.asInstanceOf[js.Any])
    if (SplitOperation != null) __obj.updateDynamic("SplitOperation")(SplitOperation.asInstanceOf[js.Any])
    if (Stream != null) __obj.updateDynamic("Stream")(Stream.asInstanceOf[js.Any])
    if (Variable != null) __obj.updateDynamic("Variable")(Variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonClientExtension]
  }
}

