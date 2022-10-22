package typingsJapgolly.mobxStateTree

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.mobxStateTree.anon.Actions
import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.IType
import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.Instance
import typingsJapgolly.mobxStateTree.distTypesUtilityTypesSnapshotProcessorMod.CustomOrOther
import typingsJapgolly.mobxStateTree.distTypesUtilityTypesSnapshotProcessorMod.NotCustomized
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesComplexTypesModelMod {
  
  @JSImport("mobx-state-tree/dist/types/complex-types/model", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](name: String, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[IModelType[PA & PB, OA & OB, CustomJoin[FCA, FCB], CustomJoin[FSA, FSB]]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): IModelType[
    PA & PB & PC, 
    OA & OB & OC, 
    CustomJoin[FCA, CustomJoin[FCB, FCC]], 
    CustomJoin[FSA, CustomJoin[FSB, FSC]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC, 
    OA & OB & OC, 
    CustomJoin[FCA, CustomJoin[FCB, FCC]], 
    CustomJoin[FSA, CustomJoin[FSB, FSC]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC]
  ): IModelType[
    PA & PB & PC, 
    OA & OB & OC, 
    CustomJoin[FCA, CustomJoin[FCB, FCC]], 
    CustomJoin[FSA, CustomJoin[FSB, FSC]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC, 
    OA & OB & OC, 
    CustomJoin[FCA, CustomJoin[FCB, FCC]], 
    CustomJoin[FSA, CustomJoin[FSB, FSC]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): IModelType[
    PA & PB & PC & PD, 
    OA & OB & OC & OD, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD, 
    OA & OB & OC & OD, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): IModelType[
    PA & PB & PC & PD, 
    OA & OB & OC & OD, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD, 
    OA & OB & OC & OD, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, FCD]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, FSD]]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): IModelType[
    PA & PB & PC & PD & PE, 
    OA & OB & OC & OD & OE, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE, 
    OA & OB & OC & OD & OE, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): IModelType[
    PA & PB & PC & PD & PE, 
    OA & OB & OC & OD & OE, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE, 
    OA & OB & OC & OD & OE, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, FCE]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, FSE]]]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): IModelType[
    PA & PB & PC & PD & PE & PF, 
    OA & OB & OC & OD & OE & OF, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF, 
    OA & OB & OC & OD & OE & OF, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): IModelType[
    PA & PB & PC & PD & PE & PF, 
    OA & OB & OC & OD & OE & OF, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF, 
    OA & OB & OC & OD & OE & OF, 
    CustomJoin[FCA, CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, FCF]]]]], 
    CustomJoin[FSA, CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, FSF]]]]]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): IModelType[
    PA & PB & PC & PD & PE & PF & PG, 
    OA & OB & OC & OD & OE & OF & OG, 
    CustomJoin[
      FCA, 
      CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF & PG, 
    OA & OB & OC & OD & OE & OF & OG, 
    CustomJoin[
      FCA, 
      CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
    ]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): IModelType[
    PA & PB & PC & PD & PE & PF & PG, 
    OA & OB & OC & OD & OE & OF & OG, 
    CustomJoin[
      FCA, 
      CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF & PG, 
    OA & OB & OC & OD & OE & OF & OG, 
    CustomJoin[
      FCA, 
      CustomJoin[FCB, CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, FCG]]]]]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[FSB, CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, FSG]]]]]
    ]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH, 
    OA & OB & OC & OD & OE & OF & OG & OH, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH, 
    OA & OB & OC & OD & OE & OF & OG & OH, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
      ]
    ]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH, 
    OA & OB & OC & OD & OE & OF & OG & OH, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH, 
    OA & OB & OC & OD & OE & OF & OG & OH, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[FCC, CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, FCH]]]]]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[FSC, CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, FSH]]]]]
      ]
    ]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH & PI, 
    OA & OB & OC & OD & OE & OF & OG & OH & OI, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[
          FCC, 
          CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
        ]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[
          FSC, 
          CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
        ]
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH & PI, 
    OA & OB & OC & OD & OE & OF & OG & OH & OI, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[
          FCC, 
          CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
        ]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[
          FSC, 
          CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
        ]
      ]
    ]
  ]]
  inline def compose[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    name: String,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH & PI, 
    OA & OB & OC & OD & OE & OF & OG & OH & OI, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[
          FCC, 
          CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
        ]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[
          FSC, 
          CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
        ]
      ]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("compose")(name.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[IModelType[
    PA & PB & PC & PD & PE & PF & PG & PH & PI, 
    OA & OB & OC & OD & OE & OF & OG & OH & OI, 
    CustomJoin[
      FCA, 
      CustomJoin[
        FCB, 
        CustomJoin[
          FCC, 
          CustomJoin[FCD, CustomJoin[FCE, CustomJoin[FCF, CustomJoin[FCG, CustomJoin[FCH, FCI]]]]]
        ]
      ]
    ], 
    CustomJoin[
      FSA, 
      CustomJoin[
        FSB, 
        CustomJoin[
          FSC, 
          CustomJoin[FSD, CustomJoin[FSE, CustomJoin[FSF, CustomJoin[FSG, CustomJoin[FSH, FSI]]]]]
        ]
      ]
    ]
  ]]
  
  inline def isModelType[IT /* <: IAnyModelType */](`type`: IAnyType): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isModelType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def model[P /* <: ModelPropertiesDeclaration */](): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")().asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
  inline def model[P /* <: ModelPropertiesDeclaration */](name: String): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any]).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
  inline def model[P /* <: ModelPropertiesDeclaration */](name: String, properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = (^.asInstanceOf[js.Dynamic].applyDynamic("model")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
  inline def model[P /* <: ModelPropertiesDeclaration */](properties: P): IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized] = ^.asInstanceOf[js.Dynamic].applyDynamic("model")(properties.asInstanceOf[js.Any]).asInstanceOf[IModelType[ModelPropertiesDeclarationToProperties[P], js.Object, NotCustomized, NotCustomized]]
  
  @JSImport("mobx-state-tree/dist/types/complex-types/model", "$nonEmptyObject")
  @js.native
  val nonEmptyObject: js.Symbol = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends mobx-state-tree.mobx-state-tree/dist/types/utility-types/snapshotProcessor._NotCustomized ? B : A & B
    }}}
    */
  @js.native
  trait CustomJoin[A, B] extends StObject
  
  /**
    * Name of the properties of an object that can't be set to undefined, any or unknown
    * @hidden
    */
  type DefinablePropsNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: mobx-state-tree.mobx-state-tree/dist/types/complex-types/model.IsOptionalValue<T[K], never, K>}[keyof T] */ js.Any
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ k in keyof P ]: P[k]['CreationType']}
    }}}
    */
  type ExtractCFromProps[P /* <: ModelProperties */] = /* import warning: importer.ImportType#apply Failed type conversion: P[k] */ js.Any
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends mobx-state-tree.mobx-state-tree/dist/types/complex-types/model.IModelType<any, infer O, any, any> ? O : never
    }}}
    */
  @js.native
  trait ExtractOthers[T /* <: IAnyModelType */] extends StObject
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends mobx-state-tree.mobx-state-tree/dist/types/complex-types/model.IModelType<infer P, any, any, any> ? P : never
    }}}
    */
  @js.native
  trait ExtractProps[T /* <: IAnyModelType */] extends StObject
  
  type IAnyModelType = IModelType[Any, Any, Any, Any]
  
  @js.native
  trait IModelType[PROPS /* <: ModelProperties */, OTHERS, CustomC, CustomS]
    extends StObject
       with IType[
          ModelCreationType2[PROPS, CustomC], 
          ModelSnapshotType2[PROPS, CustomS], 
          ModelInstanceType[PROPS, OTHERS]
        ] {
    
    def actions[A /* <: ModelActions */](fn: js.Function1[/* self */ Instance[this.type], A]): IModelType[PROPS, OTHERS & A, CustomC, CustomS] = js.native
    
    def extend[A /* <: ModelActions */, V /* <: js.Object */, VS /* <: js.Object */](fn: js.Function1[/* self */ Instance[this.type], Actions[A, V, VS]]): IModelType[PROPS, OTHERS & A & V & VS, CustomC, CustomS] = js.native
    
    def named(newName: String): IModelType[PROPS, OTHERS, CustomC, CustomS] = js.native
    
    /** @deprecated See `types.snapshotProcessor` */
    def postProcessSnapshot[NewS](fn: js.Function1[/* snapshot */ ModelSnapshotType2[PROPS, CustomS], NewS]): IModelType[PROPS, OTHERS, CustomC, NewS] = js.native
    
    /** @deprecated See `types.snapshotProcessor` */
    def preProcessSnapshot[NewC](fn: js.Function1[/* snapshot */ NewC, ModelCreationType2[PROPS, CustomC]]): IModelType[PROPS, OTHERS, NewC, CustomS] = js.native
    
    val properties: PROPS = js.native
    
    def props[PROPS2 /* <: ModelPropertiesDeclaration */](props: PROPS2): IModelType[PROPS & ModelPropertiesDeclarationToProperties[PROPS2], OTHERS, CustomC, CustomS] = js.native
    
    def views[V /* <: js.Object */](fn: js.Function1[/* self */ Instance[this.type], V]): IModelType[PROPS, OTHERS & V, CustomC, CustomS] = js.native
    
    def volatile[TP /* <: js.Object */](fn: js.Function1[/* self */ Instance[this.type], TP]): IModelType[PROPS, OTHERS & TP, CustomC, CustomS] = js.native
  }
  
  /**
    * Checks if a value is optional (undefined, any or unknown).
    * @hidden
    *
    * Examples:
    * - string = false
    * - undefined = true
    * - string | undefined = true
    * - string & undefined = false, but we don't care
    * - any = true
    * - unknown = true
    */
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    undefined extends C ? TV : FV
    }}}
    */
  @js.native
  trait IsOptionalValue[C, TV, FV] extends StObject
  
  type ModelActions = StringDictionary[js.Function]
  
  type ModelCreationType[PC] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in mobx-state-tree.mobx-state-tree/dist/types/complex-types/model.DefinablePropsNames<PC> ]: PC[P]} */ js.Any) & Partial[PC] & NonEmptyObject_
  
  type ModelCreationType2[P /* <: ModelProperties */, CustomC] = CustomOrOther[CustomC, ModelCreationType[ExtractCFromProps[P]]]
  
  type ModelInstanceType[P /* <: ModelProperties */, O] = ModelInstanceTypeProps[P] & O
  
  type ModelInstanceTypeProps[P /* <: ModelProperties */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: P[K]['Type']} */ js.Any) & NonEmptyObject_
  
  type ModelPrimitive = String | Double | Boolean | js.Date
  
  type ModelProperties = StringDictionary[IAnyType]
  
  type ModelPropertiesDeclaration = StringDictionary[ModelPrimitive | IAnyType]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends {[k: string] : mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType} ? T : {[ K in keyof T ]: T[K] extends mobx-state-tree.mobx-state-tree/dist/core/type/type.IAnyType? T[K] : T[K] extends string? mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<string | undefined, string, string> : T[K] extends number? mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<number | undefined, number, number> : T[K] extends boolean? mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<boolean | undefined, boolean, boolean> : T[K] extends std.Date? mobx-state-tree.mobx-state-tree/dist/core/type/type.IType<number | std.Date | undefined, number, std.Date> : never}
    }}}
    */
  @js.native
  trait ModelPropertiesDeclarationToProperties[T /* <: ModelPropertiesDeclaration */] extends StObject
  
  type ModelSnapshotType[P /* <: ModelProperties */] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof P ]: P[K]['SnapshotType']} */ js.Any) & NonEmptyObject_
  
  type ModelSnapshotType2[P /* <: ModelProperties */, CustomS] = CustomOrOther[CustomS, ModelSnapshotType[P]]
  
  @js.native
  trait NonEmptyObject_ extends StObject
}
