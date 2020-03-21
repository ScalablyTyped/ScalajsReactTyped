package typingsJapgolly.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stackTypesMod {
  type IStackComponent = typingsJapgolly.uifabricFoundation.libIcomponentMod.IComponent[
    typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackProps, 
    typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackTokens, 
    typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackStyles, 
    typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackProps, 
    js.Object
  ]
  type IStackSlot = typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotProp[typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackProps, scala.Nothing]
  type IStackStylesReturnType = typingsJapgolly.std.ReturnType[
    typingsJapgolly.std.Extract[
      typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackProps, 
        typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackTokens, 
        typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackStyles
      ], 
      js.Function
    ]
  ]
  type IStackTokenReturnType = typingsJapgolly.std.ReturnType[
    typingsJapgolly.std.Extract[
      typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackProps, 
        typingsJapgolly.officeUiFabricReact.stackTypesMod.IStackTokens
      ], 
      js.Function
    ]
  ]
}
