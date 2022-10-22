package typingsJapgolly.convertUnits.mod

import typingsJapgolly.convertUnits.convertUnitsStrings.Gb_
import typingsJapgolly.convertUnits.convertUnitsStrings.Kb_
import typingsJapgolly.convertUnits.convertUnitsStrings.Mb_
import typingsJapgolly.convertUnits.convertUnitsStrings.Tb_
import typingsJapgolly.convertUnits.convertUnitsStrings.b_
import typingsJapgolly.convertUnits.convertUnitsStrings.mHz_
import typingsJapgolly.convertUnits.convertUnitsStrings.mVAR_
import typingsJapgolly.convertUnits.convertUnitsStrings.mVARh_
import typingsJapgolly.convertUnits.convertUnitsStrings.mVA_
import typingsJapgolly.convertUnits.convertUnitsStrings.mW_
import typingsJapgolly.convertUnits.convertUnitsStrings.mWh_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Angle
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm
  - typingsJapgolly.convertUnits.convertUnitsStrings.m
  - typingsJapgolly.convertUnits.convertUnitsStrings.km
  - typingsJapgolly.convertUnits.convertUnitsStrings.in
  - typingsJapgolly.convertUnits.convertUnitsStrings.`ft-us`
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft
  - typingsJapgolly.convertUnits.convertUnitsStrings.mi
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm2
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm2
  - typingsJapgolly.convertUnits.convertUnitsStrings.m2
  - typingsJapgolly.convertUnits.convertUnitsStrings.ha
  - typingsJapgolly.convertUnits.convertUnitsStrings.km2
  - typingsJapgolly.convertUnits.convertUnitsStrings.in2
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft2
  - typingsJapgolly.convertUnits.convertUnitsStrings.ac
  - typingsJapgolly.convertUnits.convertUnitsStrings.mi2
  - typingsJapgolly.convertUnits.convertUnitsStrings.mcg
  - typingsJapgolly.convertUnits.convertUnitsStrings.mg
  - typingsJapgolly.convertUnits.convertUnitsStrings.g
  - typingsJapgolly.convertUnits.convertUnitsStrings.kg
  - typingsJapgolly.convertUnits.convertUnitsStrings.oz
  - typingsJapgolly.convertUnits.convertUnitsStrings.lb
  - typingsJapgolly.convertUnits.convertUnitsStrings.mt
  - typingsJapgolly.convertUnits.convertUnitsStrings.t
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm3
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm3
  - typingsJapgolly.convertUnits.convertUnitsStrings.ml
  - typingsJapgolly.convertUnits.convertUnitsStrings.l
  - typingsJapgolly.convertUnits.convertUnitsStrings.kl
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3
  - typingsJapgolly.convertUnits.convertUnitsStrings.km3
  - typingsJapgolly.convertUnits.convertUnitsStrings.tsp
  - typingsJapgolly.convertUnits.convertUnitsStrings.Tbs
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-oz`
  - typingsJapgolly.convertUnits.convertUnitsStrings.cup
  - typingsJapgolly.convertUnits.convertUnitsStrings.pnt
  - typingsJapgolly.convertUnits.convertUnitsStrings.qt
  - typingsJapgolly.convertUnits.convertUnitsStrings.gal
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3
  - typingsJapgolly.convertUnits.convertUnitsStrings.mm3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.cm3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.mlSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.clSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.dlSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.lSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.lSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.lSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.klSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.klSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.klSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.km3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.tspSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.TbsSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashs`
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashmin`
  - typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashh`
  - typingsJapgolly.convertUnits.convertUnitsStrings.cupSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.qtSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.galSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.galSlashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.galSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.C
  - typingsJapgolly.convertUnits.convertUnitsStrings.F
  - typingsJapgolly.convertUnits.convertUnitsStrings.K
  - typingsJapgolly.convertUnits.convertUnitsStrings.R
  - typingsJapgolly.convertUnits.convertUnitsStrings.ns
  - typingsJapgolly.convertUnits.convertUnitsStrings.mu
  - typingsJapgolly.convertUnits.convertUnitsStrings.ms
  - typingsJapgolly.convertUnits.convertUnitsStrings.s
  - typingsJapgolly.convertUnits.convertUnitsStrings.min
  - typingsJapgolly.convertUnits.convertUnitsStrings.h
  - typingsJapgolly.convertUnits.convertUnitsStrings.d
  - typingsJapgolly.convertUnits.convertUnitsStrings.week
  - typingsJapgolly.convertUnits.convertUnitsStrings.month
  - typingsJapgolly.convertUnits.convertUnitsStrings.year
  - typingsJapgolly.convertUnits.convertUnitsStrings.Hz
  - typingsJapgolly.convertUnits.convertUnitsStrings.mHz_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.MHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.GHz
  - typingsJapgolly.convertUnits.convertUnitsStrings.THz
  - typingsJapgolly.convertUnits.convertUnitsStrings.rpm
  - typingsJapgolly.convertUnits.convertUnitsStrings.degSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.radSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.mSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.kmSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mSlashh
  - typingsJapgolly.convertUnits.convertUnitsStrings.knot
  - typingsJapgolly.convertUnits.convertUnitsStrings.ftSlashs
  - typingsJapgolly.convertUnits.convertUnitsStrings.sSlashm
  - typingsJapgolly.convertUnits.convertUnitsStrings.minSlashkm
  - typingsJapgolly.convertUnits.convertUnitsStrings.sSlashft
  - typingsJapgolly.convertUnits.convertUnitsStrings.Pa
  - typingsJapgolly.convertUnits.convertUnitsStrings.hPa
  - typingsJapgolly.convertUnits.convertUnitsStrings.kPa
  - typingsJapgolly.convertUnits.convertUnitsStrings.MPa
  - typingsJapgolly.convertUnits.convertUnitsStrings.bar
  - typingsJapgolly.convertUnits.convertUnitsStrings.torr
  - typingsJapgolly.convertUnits.convertUnitsStrings.psi
  - typingsJapgolly.convertUnits.convertUnitsStrings.ksi
  - typingsJapgolly.convertUnits.convertUnitsStrings.b_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Kb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Mb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Gb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.Tb_
  - typingsJapgolly.convertUnits.convertUnitsStrings.B
  - typingsJapgolly.convertUnits.convertUnitsStrings.KB
  - typingsJapgolly.convertUnits.convertUnitsStrings.MB
  - typingsJapgolly.convertUnits.convertUnitsStrings.GB
  - typingsJapgolly.convertUnits.convertUnitsStrings.TB
  - typingsJapgolly.convertUnits.convertUnitsStrings.lx
  - typingsJapgolly.convertUnits.convertUnitsStrings.`ft-cd`
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppm
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppb
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppt
  - typingsJapgolly.convertUnits.convertUnitsStrings.ppq
  - typingsJapgolly.convertUnits.convertUnitsStrings.V
  - typingsJapgolly.convertUnits.convertUnitsStrings.mV
  - typingsJapgolly.convertUnits.convertUnitsStrings.kV
  - typingsJapgolly.convertUnits.convertUnitsStrings.A
  - typingsJapgolly.convertUnits.convertUnitsStrings.mA
  - typingsJapgolly.convertUnits.convertUnitsStrings.kA
  - typingsJapgolly.convertUnits.convertUnitsStrings.W
  - typingsJapgolly.convertUnits.convertUnitsStrings.mW_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kW
  - typingsJapgolly.convertUnits.convertUnitsStrings.MW
  - typingsJapgolly.convertUnits.convertUnitsStrings.GW
  - typingsJapgolly.convertUnits.convertUnitsStrings.VA
  - typingsJapgolly.convertUnits.convertUnitsStrings.mVA_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kVA
  - typingsJapgolly.convertUnits.convertUnitsStrings.MVA
  - typingsJapgolly.convertUnits.convertUnitsStrings.GVA
  - typingsJapgolly.convertUnits.convertUnitsStrings.VAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.mVAR_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kVAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.MVAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.GVAR
  - typingsJapgolly.convertUnits.convertUnitsStrings.Wh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mWh_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.MWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.GWh
  - typingsJapgolly.convertUnits.convertUnitsStrings.J
  - typingsJapgolly.convertUnits.convertUnitsStrings.kJ
  - typingsJapgolly.convertUnits.convertUnitsStrings.VARh
  - typingsJapgolly.convertUnits.convertUnitsStrings.mVARh_
  - typingsJapgolly.convertUnits.convertUnitsStrings.kVARh
  - typingsJapgolly.convertUnits.convertUnitsStrings.MVARh
  - typingsJapgolly.convertUnits.convertUnitsStrings.GVARH
  - typingsJapgolly.convertUnits.convertUnitsStrings.deg
  - typingsJapgolly.convertUnits.convertUnitsStrings.rad
  - typingsJapgolly.convertUnits.convertUnitsStrings.grad
  - typingsJapgolly.convertUnits.convertUnitsStrings.arcmin
  - typingsJapgolly.convertUnits.convertUnitsStrings.arcsec
*/
trait Unit extends StObject
object Unit {
  
  inline def A: typingsJapgolly.convertUnits.convertUnitsStrings.A = "A".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.A]
  
  inline def B: typingsJapgolly.convertUnits.convertUnitsStrings.B = "B".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.B]
  
  inline def C: typingsJapgolly.convertUnits.convertUnitsStrings.C = "C".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.C]
  
  inline def F: typingsJapgolly.convertUnits.convertUnitsStrings.F = "F".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.F]
  
  inline def GB: typingsJapgolly.convertUnits.convertUnitsStrings.GB = "GB".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.GB]
  
  inline def GHz: typingsJapgolly.convertUnits.convertUnitsStrings.GHz = "GHz".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.GHz]
  
  inline def GVA: typingsJapgolly.convertUnits.convertUnitsStrings.GVA = "GVA".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.GVA]
  
  inline def GVAR: typingsJapgolly.convertUnits.convertUnitsStrings.GVAR = "GVAR".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.GVAR]
  
  inline def GVARH: typingsJapgolly.convertUnits.convertUnitsStrings.GVARH = "GVARH".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.GVARH]
  
  inline def GW: typingsJapgolly.convertUnits.convertUnitsStrings.GW = "GW".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.GW]
  
  inline def GWh: typingsJapgolly.convertUnits.convertUnitsStrings.GWh = "GWh".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.GWh]
  
  inline def Gb: Gb_ = "Gb".asInstanceOf[Gb_]
  
  inline def Hz: typingsJapgolly.convertUnits.convertUnitsStrings.Hz = "Hz".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.Hz]
  
  inline def J: typingsJapgolly.convertUnits.convertUnitsStrings.J = "J".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.J]
  
  inline def K: typingsJapgolly.convertUnits.convertUnitsStrings.K = "K".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.K]
  
  inline def KB: typingsJapgolly.convertUnits.convertUnitsStrings.KB = "KB".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.KB]
  
  inline def Kb: Kb_ = "Kb".asInstanceOf[Kb_]
  
  inline def MB: typingsJapgolly.convertUnits.convertUnitsStrings.MB = "MB".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MB]
  
  inline def MHz: typingsJapgolly.convertUnits.convertUnitsStrings.MHz = "MHz".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MHz]
  
  inline def MPa: typingsJapgolly.convertUnits.convertUnitsStrings.MPa = "MPa".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MPa]
  
  inline def MVA: typingsJapgolly.convertUnits.convertUnitsStrings.MVA = "MVA".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MVA]
  
  inline def MVAR: typingsJapgolly.convertUnits.convertUnitsStrings.MVAR = "MVAR".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MVAR]
  
  inline def MVARh: typingsJapgolly.convertUnits.convertUnitsStrings.MVARh = "MVARh".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MVARh]
  
  inline def MW: typingsJapgolly.convertUnits.convertUnitsStrings.MW = "MW".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MW]
  
  inline def MWh: typingsJapgolly.convertUnits.convertUnitsStrings.MWh = "MWh".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.MWh]
  
  inline def Mb: Mb_ = "Mb".asInstanceOf[Mb_]
  
  inline def Pa: typingsJapgolly.convertUnits.convertUnitsStrings.Pa = "Pa".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.Pa]
  
  inline def R: typingsJapgolly.convertUnits.convertUnitsStrings.R = "R".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.R]
  
  inline def TB: typingsJapgolly.convertUnits.convertUnitsStrings.TB = "TB".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.TB]
  
  inline def THz: typingsJapgolly.convertUnits.convertUnitsStrings.THz = "THz".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.THz]
  
  inline def Tb: Tb_ = "Tb".asInstanceOf[Tb_]
  
  inline def Tbs: typingsJapgolly.convertUnits.convertUnitsStrings.Tbs = "Tbs".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.Tbs]
  
  inline def TbsSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.TbsSlashs = "Tbs/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.TbsSlashs]
  
  inline def V: typingsJapgolly.convertUnits.convertUnitsStrings.V = "V".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.V]
  
  inline def VA: typingsJapgolly.convertUnits.convertUnitsStrings.VA = "VA".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.VA]
  
  inline def VAR: typingsJapgolly.convertUnits.convertUnitsStrings.VAR = "VAR".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.VAR]
  
  inline def VARh: typingsJapgolly.convertUnits.convertUnitsStrings.VARh = "VARh".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.VARh]
  
  inline def W: typingsJapgolly.convertUnits.convertUnitsStrings.W = "W".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.W]
  
  inline def Wh: typingsJapgolly.convertUnits.convertUnitsStrings.Wh = "Wh".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.Wh]
  
  inline def ac: typingsJapgolly.convertUnits.convertUnitsStrings.ac = "ac".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ac]
  
  inline def arcmin: typingsJapgolly.convertUnits.convertUnitsStrings.arcmin = "arcmin".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.arcmin]
  
  inline def arcsec: typingsJapgolly.convertUnits.convertUnitsStrings.arcsec = "arcsec".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.arcsec]
  
  inline def b: b_ = "b".asInstanceOf[b_]
  
  inline def bar: typingsJapgolly.convertUnits.convertUnitsStrings.bar = "bar".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.bar]
  
  inline def clSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.clSlashs = "cl/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.clSlashs]
  
  inline def cm: typingsJapgolly.convertUnits.convertUnitsStrings.cm = "cm".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.cm]
  
  inline def cm2: typingsJapgolly.convertUnits.convertUnitsStrings.cm2 = "cm2".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.cm2]
  
  inline def cm3: typingsJapgolly.convertUnits.convertUnitsStrings.cm3 = "cm3".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.cm3]
  
  inline def cm3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.cm3Slashs = "cm3/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.cm3Slashs]
  
  inline def cup: typingsJapgolly.convertUnits.convertUnitsStrings.cup = "cup".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.cup]
  
  inline def cupSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.cupSlashs = "cup/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.cupSlashs]
  
  inline def d: typingsJapgolly.convertUnits.convertUnitsStrings.d = "d".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.d]
  
  inline def deg: typingsJapgolly.convertUnits.convertUnitsStrings.deg = "deg".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.deg]
  
  inline def degSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.degSlashs = "deg/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.degSlashs]
  
  inline def dlSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.dlSlashs = "dl/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.dlSlashs]
  
  inline def `fl-oz`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-oz` = "fl-oz".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.`fl-oz`]
  
  inline def `fl-ozSlashh`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashh` = "fl-oz/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashh`]
  
  inline def `fl-ozSlashmin`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashmin` = "fl-oz/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashmin`]
  
  inline def `fl-ozSlashs`: typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashs` = "fl-oz/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.`fl-ozSlashs`]
  
  inline def ft: typingsJapgolly.convertUnits.convertUnitsStrings.ft = "ft".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ft]
  
  inline def `ft-cd`: typingsJapgolly.convertUnits.convertUnitsStrings.`ft-cd` = "ft-cd".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.`ft-cd`]
  
  inline def `ft-us`: typingsJapgolly.convertUnits.convertUnitsStrings.`ft-us` = "ft-us".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.`ft-us`]
  
  inline def ft2: typingsJapgolly.convertUnits.convertUnitsStrings.ft2 = "ft2".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ft2]
  
  inline def ft3: typingsJapgolly.convertUnits.convertUnitsStrings.ft3 = "ft3".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ft3]
  
  inline def ft3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashh = "ft3/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashh]
  
  inline def ft3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashmin = "ft3/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashmin]
  
  inline def ft3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashs = "ft3/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ft3Slashs]
  
  inline def ftSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.ftSlashs = "ft/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ftSlashs]
  
  inline def g: typingsJapgolly.convertUnits.convertUnitsStrings.g = "g".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.g]
  
  inline def gal: typingsJapgolly.convertUnits.convertUnitsStrings.gal = "gal".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.gal]
  
  inline def galSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.galSlashh = "gal/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.galSlashh]
  
  inline def galSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.galSlashmin = "gal/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.galSlashmin]
  
  inline def galSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.galSlashs = "gal/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.galSlashs]
  
  inline def grad: typingsJapgolly.convertUnits.convertUnitsStrings.grad = "grad".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.grad]
  
  inline def h: typingsJapgolly.convertUnits.convertUnitsStrings.h = "h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.h]
  
  inline def hPa: typingsJapgolly.convertUnits.convertUnitsStrings.hPa = "hPa".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.hPa]
  
  inline def ha: typingsJapgolly.convertUnits.convertUnitsStrings.ha = "ha".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ha]
  
  inline def in: typingsJapgolly.convertUnits.convertUnitsStrings.in = "in".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.in]
  
  inline def in2: typingsJapgolly.convertUnits.convertUnitsStrings.in2 = "in2".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.in2]
  
  inline def in3: typingsJapgolly.convertUnits.convertUnitsStrings.in3 = "in3".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.in3]
  
  inline def in3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashh = "in3/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashh]
  
  inline def in3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashmin = "in3/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashmin]
  
  inline def in3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashs = "in3/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.in3Slashs]
  
  inline def kA: typingsJapgolly.convertUnits.convertUnitsStrings.kA = "kA".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kA]
  
  inline def kHz: typingsJapgolly.convertUnits.convertUnitsStrings.kHz = "kHz".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kHz]
  
  inline def kJ: typingsJapgolly.convertUnits.convertUnitsStrings.kJ = "kJ".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kJ]
  
  inline def kPa: typingsJapgolly.convertUnits.convertUnitsStrings.kPa = "kPa".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kPa]
  
  inline def kV: typingsJapgolly.convertUnits.convertUnitsStrings.kV = "kV".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kV]
  
  inline def kVA: typingsJapgolly.convertUnits.convertUnitsStrings.kVA = "kVA".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kVA]
  
  inline def kVAR: typingsJapgolly.convertUnits.convertUnitsStrings.kVAR = "kVAR".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kVAR]
  
  inline def kVARh: typingsJapgolly.convertUnits.convertUnitsStrings.kVARh = "kVARh".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kVARh]
  
  inline def kW: typingsJapgolly.convertUnits.convertUnitsStrings.kW = "kW".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kW]
  
  inline def kWh: typingsJapgolly.convertUnits.convertUnitsStrings.kWh = "kWh".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kWh]
  
  inline def kg: typingsJapgolly.convertUnits.convertUnitsStrings.kg = "kg".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kg]
  
  inline def kl: typingsJapgolly.convertUnits.convertUnitsStrings.kl = "kl".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kl]
  
  inline def klSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.klSlashh = "kl/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.klSlashh]
  
  inline def klSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.klSlashmin = "kl/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.klSlashmin]
  
  inline def klSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.klSlashs = "kl/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.klSlashs]
  
  inline def km: typingsJapgolly.convertUnits.convertUnitsStrings.km = "km".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.km]
  
  inline def km2: typingsJapgolly.convertUnits.convertUnitsStrings.km2 = "km2".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.km2]
  
  inline def km3: typingsJapgolly.convertUnits.convertUnitsStrings.km3 = "km3".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.km3]
  
  inline def km3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.km3Slashs = "km3/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.km3Slashs]
  
  inline def kmSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.kmSlashh = "km/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.kmSlashh]
  
  inline def knot: typingsJapgolly.convertUnits.convertUnitsStrings.knot = "knot".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.knot]
  
  inline def ksi: typingsJapgolly.convertUnits.convertUnitsStrings.ksi = "ksi".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ksi]
  
  inline def l: typingsJapgolly.convertUnits.convertUnitsStrings.l = "l".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.l]
  
  inline def lSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.lSlashh = "l/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.lSlashh]
  
  inline def lSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.lSlashmin = "l/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.lSlashmin]
  
  inline def lSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.lSlashs = "l/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.lSlashs]
  
  inline def lb: typingsJapgolly.convertUnits.convertUnitsStrings.lb = "lb".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.lb]
  
  inline def lx: typingsJapgolly.convertUnits.convertUnitsStrings.lx = "lx".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.lx]
  
  inline def m: typingsJapgolly.convertUnits.convertUnitsStrings.m = "m".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.m]
  
  inline def m2: typingsJapgolly.convertUnits.convertUnitsStrings.m2 = "m2".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.m2]
  
  inline def m3: typingsJapgolly.convertUnits.convertUnitsStrings.m3 = "m3".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.m3]
  
  inline def m3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashh = "m3/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashh]
  
  inline def m3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashmin = "m3/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashmin]
  
  inline def m3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashs = "m3/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.m3Slashs]
  
  inline def mA: typingsJapgolly.convertUnits.convertUnitsStrings.mA = "mA".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mA]
  
  inline def mHz: mHz_ = "mHz".asInstanceOf[mHz_]
  
  inline def mSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.mSlashh = "m/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mSlashh]
  
  inline def mSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.mSlashs = "m/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mSlashs]
  
  inline def mV: typingsJapgolly.convertUnits.convertUnitsStrings.mV = "mV".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mV]
  
  inline def mVA: mVA_ = "mVA".asInstanceOf[mVA_]
  
  inline def mVAR: mVAR_ = "mVAR".asInstanceOf[mVAR_]
  
  inline def mVARh: mVARh_ = "mVARh".asInstanceOf[mVARh_]
  
  inline def mW: mW_ = "mW".asInstanceOf[mW_]
  
  inline def mWh: mWh_ = "mWh".asInstanceOf[mWh_]
  
  inline def mcg: typingsJapgolly.convertUnits.convertUnitsStrings.mcg = "mcg".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mcg]
  
  inline def mg: typingsJapgolly.convertUnits.convertUnitsStrings.mg = "mg".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mg]
  
  inline def mi: typingsJapgolly.convertUnits.convertUnitsStrings.mi = "mi".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mi]
  
  inline def mi2: typingsJapgolly.convertUnits.convertUnitsStrings.mi2 = "mi2".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mi2]
  
  inline def min: typingsJapgolly.convertUnits.convertUnitsStrings.min = "min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.min]
  
  inline def minSlashkm: typingsJapgolly.convertUnits.convertUnitsStrings.minSlashkm = "min/km".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.minSlashkm]
  
  inline def ml: typingsJapgolly.convertUnits.convertUnitsStrings.ml = "ml".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ml]
  
  inline def mlSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.mlSlashs = "ml/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mlSlashs]
  
  inline def mm: typingsJapgolly.convertUnits.convertUnitsStrings.mm = "mm".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mm]
  
  inline def mm2: typingsJapgolly.convertUnits.convertUnitsStrings.mm2 = "mm2".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mm2]
  
  inline def mm3: typingsJapgolly.convertUnits.convertUnitsStrings.mm3 = "mm3".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mm3]
  
  inline def mm3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.mm3Slashs = "mm3/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mm3Slashs]
  
  inline def month: typingsJapgolly.convertUnits.convertUnitsStrings.month = "month".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.month]
  
  inline def ms: typingsJapgolly.convertUnits.convertUnitsStrings.ms = "ms".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ms]
  
  inline def mt: typingsJapgolly.convertUnits.convertUnitsStrings.mt = "mt".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mt]
  
  inline def mu: typingsJapgolly.convertUnits.convertUnitsStrings.mu = "mu".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.mu]
  
  inline def ns: typingsJapgolly.convertUnits.convertUnitsStrings.ns = "ns".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ns]
  
  inline def oz: typingsJapgolly.convertUnits.convertUnitsStrings.oz = "oz".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.oz]
  
  inline def pnt: typingsJapgolly.convertUnits.convertUnitsStrings.pnt = "pnt".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.pnt]
  
  inline def pntSlashh: typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashh = "pnt/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashh]
  
  inline def pntSlashmin: typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashmin = "pnt/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashmin]
  
  inline def pntSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashs = "pnt/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.pntSlashs]
  
  inline def ppb: typingsJapgolly.convertUnits.convertUnitsStrings.ppb = "ppb".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ppb]
  
  inline def ppm: typingsJapgolly.convertUnits.convertUnitsStrings.ppm = "ppm".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ppm]
  
  inline def ppq: typingsJapgolly.convertUnits.convertUnitsStrings.ppq = "ppq".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ppq]
  
  inline def ppt: typingsJapgolly.convertUnits.convertUnitsStrings.ppt = "ppt".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.ppt]
  
  inline def psi: typingsJapgolly.convertUnits.convertUnitsStrings.psi = "psi".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.psi]
  
  inline def qt: typingsJapgolly.convertUnits.convertUnitsStrings.qt = "qt".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.qt]
  
  inline def qtSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.qtSlashs = "qt/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.qtSlashs]
  
  inline def rad: typingsJapgolly.convertUnits.convertUnitsStrings.rad = "rad".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.rad]
  
  inline def radSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.radSlashs = "rad/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.radSlashs]
  
  inline def rpm: typingsJapgolly.convertUnits.convertUnitsStrings.rpm = "rpm".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.rpm]
  
  inline def s: typingsJapgolly.convertUnits.convertUnitsStrings.s = "s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.s]
  
  inline def sSlashft: typingsJapgolly.convertUnits.convertUnitsStrings.sSlashft = "s/ft".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.sSlashft]
  
  inline def sSlashm: typingsJapgolly.convertUnits.convertUnitsStrings.sSlashm = "s/m".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.sSlashm]
  
  inline def t: typingsJapgolly.convertUnits.convertUnitsStrings.t = "t".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.t]
  
  inline def torr: typingsJapgolly.convertUnits.convertUnitsStrings.torr = "torr".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.torr]
  
  inline def tsp: typingsJapgolly.convertUnits.convertUnitsStrings.tsp = "tsp".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.tsp]
  
  inline def tspSlashs: typingsJapgolly.convertUnits.convertUnitsStrings.tspSlashs = "tsp/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.tspSlashs]
  
  inline def week: typingsJapgolly.convertUnits.convertUnitsStrings.week = "week".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.week]
  
  inline def yd3: typingsJapgolly.convertUnits.convertUnitsStrings.yd3 = "yd3".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.yd3]
  
  inline def yd3Slashh: typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashh = "yd3/h".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashh]
  
  inline def yd3Slashmin: typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashmin = "yd3/min".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashmin]
  
  inline def yd3Slashs: typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashs = "yd3/s".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.yd3Slashs]
  
  inline def year: typingsJapgolly.convertUnits.convertUnitsStrings.year = "year".asInstanceOf[typingsJapgolly.convertUnits.convertUnitsStrings.year]
}
