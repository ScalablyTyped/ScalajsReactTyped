package typingsJapgolly.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stackItemTypesMod {
  type IStackItemComponent = typingsJapgolly.uifabricFoundation.libIcomponentMod.IComponent[
    typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
    typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemTokens, 
    typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemStyles, 
    typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
    js.Object
  ]
  type IStackItemSlot = typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotProp[
    typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
    scala.Nothing
  ]
  type IStackItemStylesReturnType = typingsJapgolly.std.ReturnType[
    typingsJapgolly.std.Extract[
      typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
        typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemTokens, 
        typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemStyles
      ], 
      js.Function
    ]
  ]
  type IStackItemTokenReturnType = typingsJapgolly.std.ReturnType[
    typingsJapgolly.std.Extract[
      typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemProps, 
        typingsJapgolly.officeUiFabricReact.stackItemTypesMod.IStackItemTokens
      ], 
      js.Function
    ]
  ]
}
