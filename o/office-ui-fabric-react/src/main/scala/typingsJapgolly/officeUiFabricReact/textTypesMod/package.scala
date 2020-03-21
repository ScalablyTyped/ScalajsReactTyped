package typingsJapgolly.officeUiFabricReact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object textTypesMod {
  type ITextComponent = typingsJapgolly.uifabricFoundation.libIcomponentMod.IComponent[
    typingsJapgolly.officeUiFabricReact.textTypesMod.ITextProps, 
    typingsJapgolly.officeUiFabricReact.textTypesMod.ITextTokens, 
    typingsJapgolly.officeUiFabricReact.textTypesMod.ITextStyles, 
    typingsJapgolly.officeUiFabricReact.textTypesMod.ITextProps, 
    js.Object
  ]
  type ITextSlot = typingsJapgolly.uifabricFoundation.libIslotsMod.ISlotProp[typingsJapgolly.officeUiFabricReact.textTypesMod.ITextProps, java.lang.String]
  type ITextStylesReturnType = typingsJapgolly.std.ReturnType[
    typingsJapgolly.std.Extract[
      typingsJapgolly.uifabricFoundation.libIcomponentMod.IStylesFunctionOrObject[
        typingsJapgolly.officeUiFabricReact.textTypesMod.ITextProps, 
        typingsJapgolly.officeUiFabricReact.textTypesMod.ITextTokens, 
        typingsJapgolly.officeUiFabricReact.textTypesMod.ITextStyles
      ], 
      js.Function
    ]
  ]
  type ITextTokenReturnType = typingsJapgolly.std.ReturnType[
    typingsJapgolly.std.Extract[
      typingsJapgolly.uifabricFoundation.libIcomponentMod.ITokenFunctionOrObject[
        typingsJapgolly.officeUiFabricReact.textTypesMod.ITextProps, 
        typingsJapgolly.officeUiFabricReact.textTypesMod.ITextTokens
      ], 
      js.Function
    ]
  ]
}
