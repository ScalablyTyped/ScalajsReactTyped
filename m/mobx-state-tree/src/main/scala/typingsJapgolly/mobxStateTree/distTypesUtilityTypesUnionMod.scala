package typingsJapgolly.mobxStateTree

import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.IAnyType
import typingsJapgolly.mobxStateTree.distCoreTypeTypeMod.IType
import typingsJapgolly.mobxStateTree.distTypesComplexTypesModelMod.IModelType
import typingsJapgolly.mobxStateTree.distTypesComplexTypesModelMod.ModelCreationType2
import typingsJapgolly.mobxStateTree.distTypesComplexTypesModelMod.ModelInstanceType
import typingsJapgolly.mobxStateTree.distTypesComplexTypesModelMod.ModelProperties
import typingsJapgolly.mobxStateTree.distTypesComplexTypesModelMod.ModelSnapshotType2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilityTypesUnionMod {
  
  @JSImport("mobx-state-tree/dist/types/utility-types/union", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUnionType[IT /* <: IAnyType */](`type`: IT): /* is IT */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnionType")(`type`.asInstanceOf[js.Any]).asInstanceOf[/* is IT */ Boolean]
  
  inline def union(dispatchOrType: IAnyType, otherTypes: IAnyType*): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(scala.List(dispatchOrType.asInstanceOf[js.Any]).`++`(otherTypes.asInstanceOf[Seq[js.Any]])*).asInstanceOf[IAnyType]
  inline def union(dispatchOrType: UnionOptions, otherTypes: IAnyType*): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(scala.List(dispatchOrType.asInstanceOf[js.Any]).`++`(otherTypes.asInstanceOf[Seq[js.Any]])*).asInstanceOf[IAnyType]
  inline def union(types: IAnyType*): IAnyType = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[IAnyType]
  inline def union[CA, SA, TA, CB, SB, TB](A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB, SA | SB, TA | TB]]
  inline def union[CA, SA, TA, CB, SB, TB](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB]): ITypeUnion[CA | CB, SA | SB, TA | TB] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB, SA | SB, TA | TB]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB](options: UnionOptions, A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB]): ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB, FCA | FCB], 
    ModelSnapshotType2[PA | PB, FSA | FSB], 
    ModelInstanceType[PA | PB, OA | OB]
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC](options: UnionOptions, A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC]): ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC, SA | SB | SC, TA | TB | TC]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](A: IType[CA, SA, TA], B: IType[CB, SB, TB], C: IType[CC, SC, TC], D: IType[CD, SD, TD]): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](A: IModelType[PA, OA, FCA, FSA], B: IModelType[PB, OB, FCB, FSB], C: IModelType[PC, OC, FCC, FSC]): ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD]
  ): ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD, SA | SB | SC | SD, TA | TB | TC | TD]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC, FCA | FCB | FCC], 
    ModelSnapshotType2[PA | PB | PC, FSA | FSB | FSC], 
    ModelInstanceType[PA | PB | PC, OA | OB | OC]
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE]
  ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE]
  ): ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[CA | CB | CC | CD | CE, SA | SB | SC | SD | SE, TA | TB | TC | TD | TE]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD, FCA | FCB | FCC | FCD], 
    ModelSnapshotType2[PA | PB | PC | PD, FSA | FSB | FSC | FSD], 
    ModelInstanceType[PA | PB | PC | PD, OA | OB | OC | OD]
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF, 
    SA | SB | SC | SD | SE | SF, 
    TA | TB | TC | TD | TE | TF
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE, FCA | FCB | FCC | FCD | FCE], 
    ModelSnapshotType2[PA | PB | PC | PD | PE, FSA | FSB | FSC | FSD | FSE], 
    ModelInstanceType[PA | PB | PC | PD | PE, OA | OB | OC | OD | OE]
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG, 
    SA | SB | SC | SD | SE | SF | SG, 
    TA | TB | TC | TD | TE | TF | TG
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH, 
    SA | SB | SC | SD | SE | SF | SG | SH, 
    TA | TB | TC | TD | TE | TF | TG | TH
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF, FCA | FCB | FCC | FCD | FCE | FCF], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF, FSA | FSB | FSC | FSD | FSE | FSF], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF, OA | OB | OC | OD | OE | OF]
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH],
    I: IType[CI, SI, TI]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ]]
  inline def union[CA, SA, TA, CB, SB, TB, CC, SC, TC, CD, SD, TD, CE, SE, TE, CF, SF, TF, CG, SG, TG, CH, SH, TH, CI, SI, TI](
    options: UnionOptions,
    A: IType[CA, SA, TA],
    B: IType[CB, SB, TB],
    C: IType[CC, SC, TC],
    D: IType[CD, SD, TD],
    E: IType[CE, SE, TE],
    F: IType[CF, SF, TF],
    G: IType[CG, SG, TG],
    H: IType[CH, SH, TH],
    I: IType[CI, SI, TI]
  ): ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    CA | CB | CC | CD | CE | CF | CG | CH | CI, 
    SA | SB | SC | SD | SE | SF | SG | SH | SI, 
    TA | TB | TC | TD | TE | TF | TG | TH | TI
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG]
  ): ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[PA | PB | PC | PD | PE | PF | PG, FCA | FCB | FCC | FCD | FCE | FCF | FCG], 
    ModelSnapshotType2[PA | PB | PC | PD | PE | PF | PG, FSA | FSB | FSC | FSD | FSE | FSF | FSG], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG, OA | OB | OC | OD | OE | OF | OG]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH
    ], 
    ModelInstanceType[PA | PB | PC | PD | PE | PF | PG | PH, OA | OB | OC | OD | OE | OF | OG | OH]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ]]
  inline def union[PA /* <: ModelProperties */, OA, FCA, FSA, PB /* <: ModelProperties */, OB, FCB, FSB, PC /* <: ModelProperties */, OC, FCC, FSC, PD /* <: ModelProperties */, OD, FCD, FSD, PE /* <: ModelProperties */, OE, FCE, FSE, PF /* <: ModelProperties */, OF, FCF, FSF, PG /* <: ModelProperties */, OG, FCG, FSG, PH /* <: ModelProperties */, OH, FCH, FSH, PI /* <: ModelProperties */, OI, FCI, FSI](
    options: UnionOptions,
    A: IModelType[PA, OA, FCA, FSA],
    B: IModelType[PB, OB, FCB, FSB],
    C: IModelType[PC, OC, FCC, FSC],
    D: IModelType[PD, OD, FCD, FSD],
    E: IModelType[PE, OE, FCE, FSE],
    F: IModelType[PF, OF, FCF, FSF],
    G: IModelType[PG, OG, FCG, FSG],
    H: IModelType[PH, OH, FCH, FSH],
    I: IModelType[PI, OI, FCI, FSI]
  ): ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("union")(options.asInstanceOf[js.Any], A.asInstanceOf[js.Any], B.asInstanceOf[js.Any], C.asInstanceOf[js.Any], D.asInstanceOf[js.Any], E.asInstanceOf[js.Any], F.asInstanceOf[js.Any], G.asInstanceOf[js.Any], H.asInstanceOf[js.Any], I.asInstanceOf[js.Any])).asInstanceOf[ITypeUnion[
    ModelCreationType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FCA | FCB | FCC | FCD | FCE | FCF | FCG | FCH | FCI
    ], 
    ModelSnapshotType2[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      FSA | FSB | FSC | FSD | FSE | FSF | FSG | FSH | FSI
    ], 
    ModelInstanceType[
      PA | PB | PC | PD | PE | PF | PG | PH | PI, 
      OA | OB | OC | OD | OE | OF | OG | OH | OI
    ]
  ]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    std.Exclude<T, mobx-state-tree.mobx-state-tree/dist/types/utility-types/snapshotProcessor._NotCustomized> extends never ? mobx-state-tree.mobx-state-tree/dist/types/utility-types/snapshotProcessor._NotCustomized : std.Exclude<T, mobx-state-tree.mobx-state-tree/dist/types/utility-types/snapshotProcessor._NotCustomized>
    }}}
    */
  @js.native
  trait CustomCSProcessor[T] extends StObject
  
  type ITypeDispatcher = js.Function1[/* snapshot */ Any, IAnyType]
  
  type ITypeUnion[C, S, T] = IType[CustomCSProcessor[C], CustomCSProcessor[S], T]
  
  trait UnionOptions extends StObject {
    
    var dispatcher: js.UndefOr[ITypeDispatcher] = js.undefined
    
    var eager: js.UndefOr[Boolean] = js.undefined
  }
  object UnionOptions {
    
    inline def apply(): UnionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnionOptions]
    }
    
    extension [Self <: UnionOptions](x: Self) {
      
      inline def setDispatcher(value: /* snapshot */ Any => IAnyType): Self = StObject.set(x, "dispatcher", js.Any.fromFunction1(value))
      
      inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      inline def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
      
      inline def setEagerUndefined: Self = StObject.set(x, "eager", js.undefined)
    }
  }
}
