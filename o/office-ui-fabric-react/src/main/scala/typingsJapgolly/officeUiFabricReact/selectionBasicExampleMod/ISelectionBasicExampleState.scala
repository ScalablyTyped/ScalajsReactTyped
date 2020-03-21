package typingsJapgolly.officeUiFabricReact.selectionBasicExampleMod

import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.all
import typingsJapgolly.officeUiFabricReact.officeUiFabricReactStrings.vowels
import typingsJapgolly.uifabricUtilities.selectionTypesMod.IObjectWithKey
import typingsJapgolly.uifabricUtilities.selectionTypesMod.ISelection
import typingsJapgolly.uifabricUtilities.selectionTypesMod.SelectionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionBasicExampleState extends js.Object {
  var canSelect: all | vowels
  var items: js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
  ]
  var selection: ISelection[IObjectWithKey]
  var selectionMode: SelectionMode
}

object ISelectionBasicExampleState {
  @scala.inline
  def apply(
    canSelect: all | vowels,
    items: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IExampleItem */ _
    ],
    selection: ISelection[IObjectWithKey],
    selectionMode: SelectionMode
  ): ISelectionBasicExampleState = {
    val __obj = js.Dynamic.literal(canSelect = canSelect.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any], selectionMode = selectionMode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectionBasicExampleState]
  }
}

