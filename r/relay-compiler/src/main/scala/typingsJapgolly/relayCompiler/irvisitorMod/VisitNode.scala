package typingsJapgolly.relayCompiler.irvisitorMod

import typingsJapgolly.relayCompiler.AnonFragmentTypeCondition
import typingsJapgolly.relayCompiler.iRMod.Argument
import typingsJapgolly.relayCompiler.iRMod.ArgumentDefinition
import typingsJapgolly.relayCompiler.iRMod.ArgumentValue
import typingsJapgolly.relayCompiler.iRMod.Directive
import typingsJapgolly.relayCompiler.iRMod.Fragment
import typingsJapgolly.relayCompiler.iRMod.Handle
import typingsJapgolly.relayCompiler.iRMod.Literal
import typingsJapgolly.relayCompiler.iRMod.LocalArgumentDefinition
import typingsJapgolly.relayCompiler.iRMod.Location
import typingsJapgolly.relayCompiler.iRMod.Metadata
import typingsJapgolly.relayCompiler.iRMod.Root
import typingsJapgolly.relayCompiler.iRMod.Selection
import typingsJapgolly.relayCompiler.iRMod.Variable
import typingsJapgolly.relayCompiler.relayCompilerStrings.mutation
import typingsJapgolly.relayCompiler.relayCompilerStrings.query
import typingsJapgolly.relayCompiler.relayCompilerStrings.subscription
import typingsJapgolly.relayCompiler.schemaMod.CompositeTypeID
import typingsJapgolly.relayCompiler.schemaMod.InputTypeID
import typingsJapgolly.relayCompiler.schemaMod.LinkedFieldTypeID
import typingsJapgolly.relayCompiler.schemaMod.ScalarFieldTypeID
import typingsJapgolly.relayCompiler.schemaMod.TypeID
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.relayCompiler.iRMod.Argument
  - typingsJapgolly.relayCompiler.iRMod.ClientExtension
  - typingsJapgolly.relayCompiler.iRMod.Condition
  - typingsJapgolly.relayCompiler.iRMod.Defer
  - typingsJapgolly.relayCompiler.iRMod.Directive
  - typingsJapgolly.relayCompiler.iRMod.Fragment
  - typingsJapgolly.relayCompiler.iRMod.FragmentSpread
  - typingsJapgolly.relayCompiler.iRMod.InlineDataFragmentSpread
  - typingsJapgolly.relayCompiler.iRMod.InlineFragment
  - typingsJapgolly.relayCompiler.iRMod.LinkedField
  - typingsJapgolly.relayCompiler.iRMod.Literal
  - typingsJapgolly.relayCompiler.iRMod.LocalArgumentDefinition
  - typingsJapgolly.relayCompiler.iRMod.ModuleImport
  - typingsJapgolly.relayCompiler.iRMod.Request
  - typingsJapgolly.relayCompiler.iRMod.Root
  - typingsJapgolly.relayCompiler.iRMod.RootArgumentDefinition
  - typingsJapgolly.relayCompiler.iRMod.ScalarField
  - typingsJapgolly.relayCompiler.iRMod.SplitOperation
  - typingsJapgolly.relayCompiler.iRMod.Stream
  - typingsJapgolly.relayCompiler.iRMod.Variable
*/
trait VisitNode extends js.Object

object VisitNode {
  @scala.inline
  def Request(
    fragment: Fragment,
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Request,
    loc: Location,
    name: String,
    root: Root,
    id: String = null,
    metadata: Metadata = null,
    text: String = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Fragment(
    argumentDefinitions: js.Array[ArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Fragment,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: CompositeTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ClientExtension(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.ClientExtension,
    loc: Location,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Directive(
    args: js.Array[Argument],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Directive,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def LinkedField(
    alias: String,
    args: js.Array[Argument],
    connection: Boolean,
    directives: js.Array[Directive],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.LinkedField,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    `type`: LinkedFieldTypeID,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Defer(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Defer,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: AnonFragmentTypeCondition = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Condition(
    condition: Literal | Variable,
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Condition,
    loc: Location,
    passingValue: Boolean,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], passingValue = passingValue.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Stream(
    initialCount: ArgumentValue,
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Stream,
    label: String,
    loc: Location,
    selections: js.Array[Selection],
    `if`: ArgumentValue = null,
    metadata: Metadata = null,
    useCustomizedBatch: ArgumentValue = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(initialCount = initialCount.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (`if` != null) __obj.updateDynamic("if")(`if`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (useCustomizedBatch != null) __obj.updateDynamic("useCustomizedBatch")(useCustomizedBatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Literal(kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Literal, loc: Location, value: js.Any): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Root(
    argumentDefinitions: js.Array[LocalArgumentDefinition],
    directives: js.Array[Directive],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Root,
    loc: Location,
    name: String,
    operation: query | mutation | subscription,
    selections: Selection,
    `type`: CompositeTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(argumentDefinitions = argumentDefinitions.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def SplitOperation(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.SplitOperation,
    loc: Location,
    name: String,
    parentSources: Set[String],
    selections: js.Array[Selection],
    `type`: TypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parentSources = parentSources.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Variable(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Variable,
    loc: Location,
    variableName: String,
    `type`: TypeID = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def Argument(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.Argument,
    loc: Location,
    name: String,
    value: ArgumentValue,
    metadata: Metadata = null,
    `type`: InputTypeID = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ScalarField(
    alias: String,
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.ScalarField,
    loc: Location,
    name: String,
    `type`: ScalarFieldTypeID,
    handles: js.Array[Handle] = null,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def ModuleImport(
    documentName: String,
    id: String,
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.ModuleImport,
    loc: Location,
    module: String,
    name: String,
    selections: js.Array[Selection]
  ): VisitNode = {
    val __obj = js.Dynamic.literal(documentName = documentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def InlineFragment(
    directives: js.Array[Directive],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.InlineFragment,
    loc: Location,
    selections: js.Array[Selection],
    typeCondition: CompositeTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any], typeCondition = typeCondition.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def FragmentSpread(
    args: js.Array[Argument],
    directives: js.Array[Directive],
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.FragmentSpread,
    loc: Location,
    name: String,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def RootArgumentDefinition(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.RootArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def InlineDataFragmentSpread(
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.InlineDataFragmentSpread,
    loc: Location,
    name: String,
    selections: js.Array[Selection],
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
  @scala.inline
  def LocalArgumentDefinition(
    defaultValue: js.Any,
    kind: typingsJapgolly.relayCompiler.relayCompilerStrings.LocalArgumentDefinition,
    loc: Location,
    name: String,
    `type`: InputTypeID,
    metadata: Metadata = null
  ): VisitNode = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitNode]
  }
}

